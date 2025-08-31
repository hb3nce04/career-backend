package io.hb3nce04.career.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.entity.CareerPathCategory;
import io.hb3nce04.career.backend.repository.CareerPathCategoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CareerPathCategoryService {
    private final CareerPathCategoryRepository careerPathCategoryRepository;

    public List<CareerPathCategory> findAll() {
        return careerPathCategoryRepository.findAll();
    }
}
