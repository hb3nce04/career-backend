package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.CareerPathCategoryMapper;
import io.hb3nce04.career.backend.model.dto.CareerPathCategoryDto;
import io.hb3nce04.career.backend.model.entity.CareerPathCategory;
import io.hb3nce04.career.backend.repository.CareerPathCategoryRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class CareerPathCategoryService
        extends AbstractBaseService<CareerPathCategoryDto, CareerPathCategory, CareerPathCategoryMapper, CareerPathCategoryRepository>
{
    public CareerPathCategoryService(
            CareerPathCategoryMapper mapper,
            CareerPathCategoryRepository repository) {
        super(mapper, repository);
    }
}
