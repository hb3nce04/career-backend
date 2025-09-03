package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.SectorMapper;
import io.hb3nce04.career.backend.model.dto.SectorDto;
import io.hb3nce04.career.backend.model.entity.Sector;
import io.hb3nce04.career.backend.repository.SectorRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class SectorService extends AbstractBaseService<SectorDto, Sector, SectorMapper, SectorRepository> {
    public SectorService(
            SectorMapper mapper,
            SectorRepository repository) {
        super(mapper, repository);
    }
}
