package io.hb3nce04.career.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.model.entity.Profession;
import io.hb3nce04.career.backend.service.ProfessionService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/professions")
@RequiredArgsConstructor
public class ProfessionController {
    private final ProfessionService professionService;

    @GetMapping
    public ResponseEntity<List<Profession>> findAll() {
        return ResponseEntity.ok(professionService.findAll());
    }
}
