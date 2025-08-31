package io.hb3nce04.career.backend.model.entity;

import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Profession extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String number;

    //@OneToMany(mappedBy = "profession", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Student> students;
}
