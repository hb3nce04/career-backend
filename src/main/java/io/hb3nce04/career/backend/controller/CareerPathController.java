package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.CareerPathMapper;
import io.hb3nce04.career.backend.model.dto.CareerPathDto;
import io.hb3nce04.career.backend.model.entity.CareerPath;
import io.hb3nce04.career.backend.repository.CareerPathRepository;
import io.hb3nce04.career.backend.service.CareerPathService;

@RestController
@RequestMapping("/paths")
public class CareerPathController extends
        AbstractBaseController<CareerPathService, CareerPathDto, CareerPath, CareerPathMapper, CareerPathRepository>
{
    public CareerPathController(CareerPathService service) {
        super(service);
    }
}
