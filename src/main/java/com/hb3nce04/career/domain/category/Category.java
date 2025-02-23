package com.hb3nce04.career.domain.category;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain.field.Field;
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
public class Category extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Field> fields;
}
