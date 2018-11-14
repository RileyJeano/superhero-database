package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Top {

	@Id
	@GeneratedValue
	private Long topId;
	private String top;

	@JsonIgnore
	@OneToOne
	private Hero hero;

	public Top() {
	}

	public Top(String top) {
		super();
		this.top = top;
	}

	public Long getTopId() {
		return topId;
	}

	public String getTop() {
		return top;
	}

}
