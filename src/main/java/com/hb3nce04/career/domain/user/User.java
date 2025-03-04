package com.hb3nce04.career.domain.user;

import com.hb3nce04.career.core.BaseEntity;
import com.hb3nce04.career.domain._class.Class;
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
public class User extends BaseEntity<Integer> {
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role = Role.USER;

    @OneToMany(mappedBy = "user")
    private List<Class> classes;
}