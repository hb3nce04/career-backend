package com.hb3nce04.career.domain.field;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class FieldService extends CrudServiceImpl<FieldDto, Field, FieldMapper, Integer> {
    public FieldService(FieldRepository repository, FieldMapper mapper) {
        super(repository, mapper);
    }
}
