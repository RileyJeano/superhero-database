package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hair {

	@Id
	@GeneratedValue
	private Long hairId;
	private String hairStyle;
	private int hairNumber;

	@JsonIgnore
	@OneToOne
	private Hero hero;

	public Hair() {
	}

	public Hair(String hairStyle, int hairNumber) {
		this.hairStyle = hairStyle;
		this.hairNumber = hairNumber;
	}

	public int getHairNumber() {
		return hairNumber;
	}

	public void setHairNumber(int hairNumber) {
		this.hairNumber = hairNumber;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public Long getHairId() {
		return hairId;
	}

	public String getHairStyle() {
		return hairStyle;
	}
}
