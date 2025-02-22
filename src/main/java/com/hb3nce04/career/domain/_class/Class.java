package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain.student.Student;
import com.hb3nce04.career.domain.user.User;
import com.hb3nce04.career.domain.school.School;
import jakarta.persistence.*;
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
public class Class extends BaseEntity {
    private String name;

    private Integer finishingYear;

    @ManyToOne
    private School school;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "classId")
    private List<Student> students;
}
