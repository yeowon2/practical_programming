package com.prac.practical_programming.chapter02.sc2_3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class UserJpaEntity {
    @Id
    private String Id;
    @Column
    private String name;
    @Column
    private String email;
}
