package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends CrudServiceImpl<Student, Integer> {
    public StudentService(StudentRepository repository) {
        super(repository);
    }
}
