package com.didispace.jacocdemo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class jpa_test {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer age;

    public jpa_test(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}