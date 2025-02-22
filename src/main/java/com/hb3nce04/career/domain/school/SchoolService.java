package com.hb3nce04.career.domain.school;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SchoolService extends CrudServiceImpl<School, Integer> {
    public SchoolService(SchoolRepository repository) {
        super(repository);
    }
}
