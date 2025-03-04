package com.hb3nce04.career.domain.sector;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SectorService extends CrudServiceImpl<SectorDto, Sector, Integer> {
    public SectorService(SectorRepository repository, ModelMapper mapper) {
        super(repository, mapper, SectorDto.class, Sector.class);
    }
}