package com.hb3nce04.career.core.api.impl;

import com.hb3nce04.career.core.BaseDto;
import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.core.api.CrudController;
import com.hb3nce04.career.core.api.CrudService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Abstract controller class for resources to implement CRUD operations.
 * @param <D> resource's DTO class
 * @param <E> resource's entity class
 * @param <ID> resource's JPA primary key type
 */
public abstract class CrudControllerImpl<D extends BaseDto<ID>, E extends BaseEntity<ID>, ID> implements CrudController<D, ID> {
    private final CrudService<D, E, ID> service;

    public CrudControllerImpl(CrudService<D, E, ID> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<D>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> findById(@PathVariable("id") ID id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<D> create(@RequestBody @Valid D dto) {
        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> update(@PathVariable("id") ID id, @RequestBody @Valid D dto) {
        return new ResponseEntity<>(service.update(id, dto), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<D> delete(@PathVariable("id") ID id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
