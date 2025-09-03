package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.StudentClassMapper;
import io.hb3nce04.career.backend.model.dto.StudentClassDto;
import io.hb3nce04.career.backend.model.entity.StudentClass;
import io.hb3nce04.career.backend.repository.StudentClassRepository;
import io.hb3nce04.career.backend.service.StudentClassService;

@RestController
@RequestMapping("/classes")
public class StudentClassController
        extends AbstractBaseController<StudentClassService, StudentClassDto, StudentClass, StudentClassMapper, StudentClassRepository>
{
    public StudentClassController(StudentClassService service) {
        super(service);
    }
}
