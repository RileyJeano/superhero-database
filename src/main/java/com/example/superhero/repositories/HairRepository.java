package com.example.superhero.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.example.superhero.models.Hair;

public interface HairRepository extends CrudRepository <Hair, Long> {

	Optional<Hair> findByHairNumber(int hairNumber);

}


