package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("classes")
public class ClassController extends CrudControllerImpl<ClassDto, Class, Integer> {
    public ClassController(CrudService<ClassDto, Class, Integer> service) {
        super(service);
    }
}
