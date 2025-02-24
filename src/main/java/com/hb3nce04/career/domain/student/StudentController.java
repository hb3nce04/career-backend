package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController extends CrudControllerImpl<StudentDto, Integer> {
    public StudentController(CrudService<StudentDto, Integer> service) {
        super(service);
    }
}