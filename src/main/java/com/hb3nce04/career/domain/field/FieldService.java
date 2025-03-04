package com.hb3nce04.career.domain.field;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class FieldService extends CrudServiceImpl<FieldDto, Field, Integer> {
    public FieldService(FieldRepository repository, ModelMapper mapper) {
        super(repository, mapper, FieldDto.class, Field.class);
    }
}
