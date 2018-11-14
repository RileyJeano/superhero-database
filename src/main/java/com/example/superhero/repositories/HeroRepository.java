package com.example.superhero.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.superhero.models.Hero;


public interface HeroRepository extends CrudRepository<Hero, Long> {


}
