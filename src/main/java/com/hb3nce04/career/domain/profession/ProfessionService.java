package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.api.impl.CrudServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProfessionService extends CrudServiceImpl<ProfessionDto, Profession, Integer> {
    public ProfessionService(ProfessionRepository repository, ModelMapper mapper) {
        super(repository, mapper, ProfessionDto.class, Profession.class);
    }
}
