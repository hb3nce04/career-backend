package io.hb3nce04.career.backend.model.entity;

import java.time.Year;
import java.util.List;

import io.hb3nce04.career.backend.model.entity.common.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StudentClass extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Year finishingYear;

    @ManyToOne
    @JoinColumn(name = "school_id", nullable = false)
    private School school;

    @OneToMany(mappedBy = "studentClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    // TODO: USER
}
