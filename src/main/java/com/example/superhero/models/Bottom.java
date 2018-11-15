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
	private int bottomNumber;

	@JsonIgnore
	@OneToOne
	private Hero hero;

	public Bottom() {

	}

	public Bottom(String bottom, int bottomNumber) {
		super();
		this.bottom = bottom;
		this.bottomNumber = bottomNumber;
	}

	public int getBottomNumber() {
		return bottomNumber;
	}

	public Hero getHero() {
		return hero;
	}

	public Long getBottomId() {
		return bottomId;
	}

	public String getBottom() {
		return bottom;
	}

}
