package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("professions")
public class ProfessionController extends CrudControllerImpl<ProfessionDto, Profession, ProfessionMapper, Integer> {
    public ProfessionController(CrudService<Profession, Integer> service, ProfessionMapper mapper) {
        super(service, mapper);
    }
}
