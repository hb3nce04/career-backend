package com.hb3nce04.career.domain.sector;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain.student.Student;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sector extends BaseEntity<Integer> {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String number;

    @OneToMany(mappedBy = "sector")
    private List<Student> student;
}
