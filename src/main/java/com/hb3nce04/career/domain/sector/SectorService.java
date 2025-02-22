package com.hb3nce04.career.domain.sector;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SectorService extends CrudServiceImpl<Sector, Integer> {
    public SectorService(SectorRepository repository) {
        super(repository);
    }
}