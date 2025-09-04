package io.hb3nce04.career.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.StudentClassMapper;
import io.hb3nce04.career.backend.model.dto.StudentClassDto;
import io.hb3nce04.career.backend.model.dto.StudentDto;
import io.hb3nce04.career.backend.model.entity.StudentClass;
import io.hb3nce04.career.backend.repository.StudentClassRepository;
import io.hb3nce04.career.backend.service.StudentClassService;
import io.hb3nce04.career.backend.service.StudentService;

@RestController
@RequestMapping("/classes")
public class StudentClassController
        extends AbstractBaseController<StudentClassService, StudentClassDto, StudentClass, StudentClassMapper, StudentClassRepository>
{
    private final StudentService studentService;

    public StudentClassController(StudentClassService service, StudentService studentService) {
        super(service);
        this.studentService = studentService;
    }

    @GetMapping("/{id}/students")
    public ResponseEntity<List<StudentDto>> findAllStudentByClassId(@PathVariable Integer id) {
        return ResponseEntity.ok(this.studentService.findAllByStudentClassId(id));
    }
}
