package io.hb3nce04.career.backend.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.hb3nce04.career.backend.model.entity.CareerPath;
import io.hb3nce04.career.backend.repository.common.BaseRepository;

@Repository
public interface CareerPathRepository extends BaseRepository<CareerPath> {
    List<CareerPath> findAllByStudentId(Integer studentId);
}
