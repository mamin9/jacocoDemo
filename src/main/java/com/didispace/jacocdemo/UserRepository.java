package com.didispace.jacocdemo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository<jpa_test, Long> {

    jpa_test  findByName(String name);
    jpa_test  findByNameAndAge(String name, Integer age);
    @Query("from jpa_test u where u.name=:name")
    jpa_test  findUser(@Param("name") String name);

}
