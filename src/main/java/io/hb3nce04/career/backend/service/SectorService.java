package io.hb3nce04.career.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.entity.Sector;
import io.hb3nce04.career.backend.repository.SectorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SectorService {
    private final SectorRepository sectorRepository;

    public List<Sector> findAll() {
        return sectorRepository.findAll();
    }
}
