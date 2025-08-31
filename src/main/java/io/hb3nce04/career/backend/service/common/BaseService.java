package io.hb3nce04.career.backend.service.common;

import java.util.List;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import io.hb3nce04.career.backend.repository.common.BaseRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
abstract public class BaseService<D, E extends BaseEntity, M extends BaseMapper<D, E>, R extends BaseRepository<E>> {
    protected final M mapper;
    protected final R repository;

    public List<D> findAll() {
        return this.mapper.toDtoList(repository.findAll());
    }
}
