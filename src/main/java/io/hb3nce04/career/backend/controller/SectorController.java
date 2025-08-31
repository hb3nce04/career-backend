package io.hb3nce04.career.backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.hb3nce04.career.backend.model.entity.Sector;
import io.hb3nce04.career.backend.service.SectorService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/sectors")
@RequiredArgsConstructor
public class SectorController {
    private final SectorService sectorService;

    @GetMapping
    public ResponseEntity<List<Sector>> findAll() {
        return ResponseEntity.ok(sectorService.findAll());
    }
}
