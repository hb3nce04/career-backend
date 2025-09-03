package io.hb3nce04.career.backend.service.common;

import java.util.List;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import io.hb3nce04.career.backend.repository.common.BaseRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract public class AbstractBaseService<D, E extends BaseEntity, M extends BaseMapper<D, E>, R extends BaseRepository<E>> {
    protected final M mapper;
    protected final R repository;

    private E findEntityById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
    }

    public D create(D dto) {
        return this.mapper.toDto(repository.save(this.mapper.toEntity(dto)));
    }

    public D findById(Integer id) {
        return this.mapper.toDto(findEntityById(id));
    }

    public List<D> findAll() {
        return this.mapper.toDtoList(repository.findAll());
    }

    public D update(D dto, Integer id) {
        E entity = findEntityById(id);
        this.mapper.updateEntity(dto, entity);
        repository.save(entity);
        return this.mapper.toDto(entity);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
