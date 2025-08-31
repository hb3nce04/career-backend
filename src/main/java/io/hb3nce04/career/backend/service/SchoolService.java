package io.hb3nce04.career.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.entity.School;
import io.hb3nce04.career.backend.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}
