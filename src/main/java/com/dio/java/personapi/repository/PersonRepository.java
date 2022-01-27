package com.dio.java.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.java.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
