package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.ProfessionMapper;
import io.hb3nce04.career.backend.model.dto.ProfessionDto;
import io.hb3nce04.career.backend.model.entity.Profession;
import io.hb3nce04.career.backend.repository.ProfessionRepository;
import io.hb3nce04.career.backend.service.ProfessionService;

@RestController
@RequestMapping("/professions")
public class ProfessionController extends
        AbstractBaseController<ProfessionService, ProfessionDto, Profession, ProfessionMapper, ProfessionRepository>
{
    public ProfessionController(ProfessionService service) {
        super(service);
    }
}
