package com.hb3nce04.career.domain.profession;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain.student.Student;
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
public class Profession extends BaseEntity {
    private String name;

    private String number;

    @OneToMany(mappedBy = "profession")
    private List<Student> students;
}
