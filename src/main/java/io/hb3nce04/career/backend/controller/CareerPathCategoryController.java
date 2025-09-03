package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.CareerPathCategoryMapper;
import io.hb3nce04.career.backend.model.dto.CareerPathCategoryDto;
import io.hb3nce04.career.backend.model.entity.CareerPathCategory;
import io.hb3nce04.career.backend.repository.CareerPathCategoryRepository;
import io.hb3nce04.career.backend.service.CareerPathCategoryService;

@RestController
@RequestMapping("/categories")
public class CareerPathCategoryController extends
        AbstractBaseController<CareerPathCategoryService, CareerPathCategoryDto, CareerPathCategory, CareerPathCategoryMapper, CareerPathCategoryRepository>
{
    public CareerPathCategoryController(CareerPathCategoryService service) {
        super(service);
    }
}
