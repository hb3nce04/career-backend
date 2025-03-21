package com.hb3nce04.career.domain.field;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fields")
public class FieldController extends CrudControllerImpl<FieldDto, Field, Integer>{
    public FieldController(CrudService<FieldDto, Field, Integer> service) {
        super(service);
    }
}
