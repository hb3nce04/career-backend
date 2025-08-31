package io.hb3nce04.career.backend.model.entity;

import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CareerPath extends BaseEntity {
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "career_path_category_id")
    private CareerPathCategory careerPathCategory;
}
