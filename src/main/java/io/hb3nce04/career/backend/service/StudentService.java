package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.StudentMapper;
import io.hb3nce04.career.backend.model.dto.StudentDto;
import io.hb3nce04.career.backend.model.entity.Student;
import io.hb3nce04.career.backend.repository.StudentRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class StudentService extends AbstractBaseService<StudentDto, Student, StudentMapper, StudentRepository> {
    public StudentService(
            StudentMapper mapper,
            StudentRepository repository) {
        super(mapper, repository);
    }
}
