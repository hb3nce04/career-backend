package com.hb3nce04.career.domain.sector;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SectorService extends CrudServiceImpl<SectorDto, Sector, SectorMapper, Integer> {
    public SectorService(SectorRepository repository, SectorMapper mapper) {
        super(repository, mapper);
    }
}