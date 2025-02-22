package com.hb3nce04.career.domain.student;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain._class.Class;
import com.hb3nce04.career.domain.sector.Sector;
import com.hb3nce04.career.domain.profession.Profession;
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
    private String firstName;

    private String lastName;

    private Boolean dayShift;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classId;

    @ManyToOne
    private Sector sector;

    @ManyToOne
    private Profession profession;
}
