package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bottom {

	@Id
	@GeneratedValue
	private Long bottomId;
	private String bottom;

	@JsonIgnore
	@OneToOne
	private Hero hero;

	public Bottom() {

	}

	public Bottom(String bottom) {
		super();
		this.bottom = bottom;
	}

	public Long getBottomId() {
		return bottomId;
	}

	public String getBottom() {
		return bottom;
	}

}
