package com.hb3nce04.career.domain._class;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain.school.School;
import com.hb3nce04.career.domain.student.Student;
import com.hb3nce04.career.domain.user.User;
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
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer finishingYear;

    @ManyToOne
    @JoinColumn(nullable = false)
    private School school;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "classId")
    private List<Student> students;
}
