package com.hb3nce04.career.domain.school;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SchoolService extends CrudServiceImpl<SchoolDto, School, Integer> {
    public SchoolService(SchoolRepository repository, ModelMapper mapper) {
        super(repository, mapper, SchoolDto.class, School.class);
    }
}
