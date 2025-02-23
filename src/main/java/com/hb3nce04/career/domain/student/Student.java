package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain._class.Class;
import com.hb3nce04.career.domain.profession.Profession;
import com.hb3nce04.career.domain.sector.Sector;
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
public class Student extends BaseEntity {
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private Boolean dayShift = true;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Class classId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Sector sector;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Profession profession;
}
