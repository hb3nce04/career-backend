package io.hb3nce04.career.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.hb3nce04.career.backend.model.entity.StudentClass;
import io.hb3nce04.career.backend.repository.StudentClassRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentClassService {
    private final StudentClassRepository studentClassRepository;

    public List<StudentClass> findAll() {
        return studentClassRepository.findAll();
    }
}
