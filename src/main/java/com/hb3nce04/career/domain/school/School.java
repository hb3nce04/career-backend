package com.hb3nce04.career.domain.school;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain._class.Class;
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
public class School extends BaseEntity {
    private String name;

    @OneToMany(mappedBy = "school")
    private List<Class> classes;
}
