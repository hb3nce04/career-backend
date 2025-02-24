package com.hb3nce04.career.domain.sector;

import com.hb3nce04.career.core.api.CrudService;
import com.hb3nce04.career.core.api.impl.CrudControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sectors")
public class SectorController extends CrudControllerImpl<SectorDto, Integer> {
    public SectorController(CrudService<SectorDto, Integer> service) {
        super(service);
    }
}
