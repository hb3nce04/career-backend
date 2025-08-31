package io.hb3nce04.career.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.entity.Profession;
import io.hb3nce04.career.backend.repository.ProfessionRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfessionService {
    private final ProfessionRepository professionRepository;

    public List<Profession> findAll() {
        return professionRepository.findAll();
    }
}
