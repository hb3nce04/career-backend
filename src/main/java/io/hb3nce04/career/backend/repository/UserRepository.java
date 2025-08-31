package io.hb3nce04.career.backend.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.hb3nce04.career.backend.model.entity.User;
import io.hb3nce04.career.backend.repository.common.BaseRepository;

@Repository
public interface UserRepository extends BaseRepository<User> {
    Optional<User> findByEducationId(String educationId);
}
