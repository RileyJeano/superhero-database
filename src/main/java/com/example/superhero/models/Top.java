package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Top {

	@Id
	@GeneratedValue
	private Long topId;

}
