package io.hb3nce04.career.backend.service.common;

import java.util.List;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import io.hb3nce04.career.backend.repository.common.BaseRepository;
import lombok.RequiredArgsConstructor;

// TODO: separate service by concerns: CreateService, ReadService, UpdateService, DeleteService
@RequiredArgsConstructor
abstract public class BaseService<D, E extends BaseEntity, M extends BaseMapper<D, E>, R extends BaseRepository<E>> {
    protected final M mapper;
    protected final R repository;

    public List<D> findAll() {
        return this.mapper.toDtoList(repository.findAll());
    }

    public D create(D dto) {
        return this.mapper.toDto(repository.save(this.mapper.toEntity(dto)));
    }
}
