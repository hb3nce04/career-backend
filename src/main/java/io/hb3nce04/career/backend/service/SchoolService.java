package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.SchoolMapper;
import io.hb3nce04.career.backend.model.dto.SchoolDto;
import io.hb3nce04.career.backend.model.entity.School;
import io.hb3nce04.career.backend.repository.SchoolRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class SchoolService extends AbstractBaseService<SchoolDto, School, SchoolMapper, SchoolRepository> {
    public SchoolService(
            SchoolMapper mapper,
            SchoolRepository repository) {
        super(mapper, repository);
    }
}
