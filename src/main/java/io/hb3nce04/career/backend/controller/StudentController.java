package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.StudentMapper;
import io.hb3nce04.career.backend.model.dto.StudentDto;
import io.hb3nce04.career.backend.model.entity.Student;
import io.hb3nce04.career.backend.repository.StudentRepository;
import io.hb3nce04.career.backend.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController extends AbstractBaseController<StudentService, StudentDto, Student, StudentMapper, StudentRepository> {
    public StudentController(StudentService service) {
        super(service);
    }
}
