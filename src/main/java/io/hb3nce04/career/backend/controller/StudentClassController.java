package io.hb3nce04.career.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.model.entity.StudentClass;
import io.hb3nce04.career.backend.service.StudentClassService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/classes")
@RequiredArgsConstructor
public class StudentClassController {
    private final StudentClassService schoolClassService;

    @GetMapping
    public List<StudentClass> findAll() {
        return schoolClassService.findAll();
    }
}
