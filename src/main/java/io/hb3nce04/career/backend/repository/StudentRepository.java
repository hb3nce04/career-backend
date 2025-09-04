package io.hb3nce04.career.backend.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.hb3nce04.career.backend.model.entity.Student;
import io.hb3nce04.career.backend.repository.common.BaseRepository;

@Repository
public interface StudentRepository extends BaseRepository<Student> {
    List<Student> findAllByStudentClassId(Integer studentClassId);
}
