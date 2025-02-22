package com.hb3nce04.career.domain.school;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("schools")
public class SchoolController extends CrudControllerImpl<SchoolDto, School, SchoolMapper, Integer> {
    public SchoolController(CrudService<School, Integer> service, SchoolMapper mapper) {
        super(service, mapper);
    }
}
