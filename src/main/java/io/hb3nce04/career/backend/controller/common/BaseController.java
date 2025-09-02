package io.hb3nce04.career.backend.controller.common;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import io.hb3nce04.career.backend.repository.common.BaseRepository;
import io.hb3nce04.career.backend.service.common.BaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
abstract public class BaseController<S extends BaseService<D, E, M, R>, D, E extends BaseEntity, M extends BaseMapper<D, E>, R extends BaseRepository<E>> {
    protected final S service;

    @GetMapping
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
