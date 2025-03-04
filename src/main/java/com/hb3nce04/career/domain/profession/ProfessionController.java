package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("professions")
public class ProfessionController extends CrudControllerImpl<ProfessionDto, Profession, Integer> {
    public ProfessionController(CrudService<ProfessionDto, Profession, Integer> service) {
        super(service);
    }
}
