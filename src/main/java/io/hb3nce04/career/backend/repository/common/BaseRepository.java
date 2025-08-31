package io.hb3nce04.career.backend.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import io.hb3nce04.career.backend.model.entity.common.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Integer> {
}
