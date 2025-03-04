package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ClassService extends CrudServiceImpl<ClassDto, Class, Integer> {
    public ClassService(ClassRepository repository, ModelMapper mapper) {
        super(repository, mapper, ClassDto.class, Class.class);
    }
}
