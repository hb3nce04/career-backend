package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProfessionService extends CrudServiceImpl<ProfessionDto, Profession, ProfessionMapper, Integer> {
    public ProfessionService(ProfessionRepository repository, ProfessionMapper mapper) {
        super(repository, mapper);
    }
}
