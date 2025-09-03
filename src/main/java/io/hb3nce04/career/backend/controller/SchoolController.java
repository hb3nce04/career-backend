package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.SchoolMapper;
import io.hb3nce04.career.backend.model.dto.SchoolDto;
import io.hb3nce04.career.backend.model.entity.School;
import io.hb3nce04.career.backend.repository.SchoolRepository;
import io.hb3nce04.career.backend.service.SchoolService;

@RestController
@RequestMapping("/schools")
public class SchoolController extends AbstractBaseController<SchoolService, SchoolDto, School, SchoolMapper, SchoolRepository> {
    public SchoolController(SchoolService service) {
        super(service);
    }
}
