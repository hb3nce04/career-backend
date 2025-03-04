package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends CrudServiceImpl<StudentDto, Student, Integer> {
    public StudentService(StudentRepository repository, ModelMapper mapper) {
        super(repository, mapper, StudentDto.class, Student.class);
    }
}
