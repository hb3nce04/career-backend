package com.hb3nce04.career.domain.field;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain.category.Category;
import com.hb3nce04.career.domain.student.Student;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Field extends BaseEntity<Integer> {
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Category category;
}
