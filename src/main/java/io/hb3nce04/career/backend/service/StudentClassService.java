package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.StudentClassMapper;
import io.hb3nce04.career.backend.model.dto.StudentClassDto;
import io.hb3nce04.career.backend.model.entity.StudentClass;
import io.hb3nce04.career.backend.repository.StudentClassRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class StudentClassService extends AbstractBaseService<StudentClassDto, StudentClass, StudentClassMapper, StudentClassRepository> {
    public StudentClassService(
            StudentClassMapper mapper,
            StudentClassRepository repository) {
        super(mapper, repository);
    }
}
