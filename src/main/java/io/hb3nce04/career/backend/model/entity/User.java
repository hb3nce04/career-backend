package io.hb3nce04.career.backend.model.entity;

import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "app_user")
public class User extends BaseEntity {
    @Column(unique = true, nullable = false, length = 11)
    private String educationId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean isAdmin = false;
}
