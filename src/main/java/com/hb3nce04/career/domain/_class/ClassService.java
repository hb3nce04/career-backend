package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ClassService extends CrudServiceImpl<Class, Integer> {
    public ClassService(ClassRepository repository) {
        super(repository);
    }
}
