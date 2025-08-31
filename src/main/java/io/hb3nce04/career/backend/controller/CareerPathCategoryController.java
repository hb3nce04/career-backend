package io.hb3nce04.career.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.model.entity.CareerPathCategory;
import io.hb3nce04.career.backend.service.CareerPathCategoryService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CareerPathCategoryController {
    private final CareerPathCategoryService careerPathCategoryService;

    @GetMapping
    public ResponseEntity<List<CareerPathCategory>> findAll() {
        return ResponseEntity.ok(careerPathCategoryService.findAll());
    }
}
