package io.hb3nce04.career.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.controller.common.AbstractBaseController;
import io.hb3nce04.career.backend.mapper.SectorMapper;
import io.hb3nce04.career.backend.model.dto.SectorDto;
import io.hb3nce04.career.backend.model.entity.Sector;
import io.hb3nce04.career.backend.repository.SectorRepository;
import io.hb3nce04.career.backend.service.SectorService;

@RestController
@RequestMapping("/sectors")
public class SectorController extends AbstractBaseController<SectorService, SectorDto, Sector, SectorMapper, SectorRepository> {
    public SectorController(SectorService service) {
        super(service);
    }
}
