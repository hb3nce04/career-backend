package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProfessionService extends CrudServiceImpl<Profession, Integer> {
    public ProfessionService(ProfessionRepository repository) {
        super(repository);
    }
}
