package io.hb3nce04.career.backend.repository;

import org.springframework.stereotype.Repository;

import io.hb3nce04.career.backend.model.entity.Profession;
import io.hb3nce04.career.backend.repository.common.BaseRepository;

@Repository
public interface ProfessionRepository extends BaseRepository<Profession> {
}
