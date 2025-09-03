package io.hb3nce04.career.backend.service;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.mapper.ProfessionMapper;
import io.hb3nce04.career.backend.model.dto.ProfessionDto;
import io.hb3nce04.career.backend.model.entity.Profession;
import io.hb3nce04.career.backend.repository.ProfessionRepository;
import io.hb3nce04.career.backend.service.common.AbstractBaseService;

@Service
public class ProfessionService extends AbstractBaseService<ProfessionDto, Profession, ProfessionMapper, ProfessionRepository> {
    public ProfessionService(
            ProfessionMapper mapper,
            ProfessionRepository repository) {
        super(mapper, repository);
    }
}
