package io.hb3nce04.career.backend.controller.common;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import io.hb3nce04.career.backend.mapper.common.BaseMapper;
import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import io.hb3nce04.career.backend.repository.common.BaseRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
abstract public class AbstractBaseController<S extends AbstractBaseService<D, E, M, R>, D, E extends BaseEntity, M extends BaseMapper<D, E>, R extends BaseRepository<E>> {
    protected final S service;

    @PostMapping
    public ResponseEntity<D> create(@RequestBody @Valid D dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(
            @RequestBody @Valid D dto,
            @PathVariable Integer id) {
        return ResponseEntity.ok(service.update(dto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.ok(HttpEntity.EMPTY);
    }
}
