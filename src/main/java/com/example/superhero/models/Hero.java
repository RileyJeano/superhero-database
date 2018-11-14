package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hero {

	@Id
	@GeneratedValue
	private Long heroId;
	private String heroName;

	@JsonIgnore
	@OneToOne
	private Head heroHead;

	@JsonIgnore
	@OneToOne
	private Hair heroHair;

	@JsonIgnore
	@OneToOne
	private Top heroTop;

	@JsonIgnore
	@OneToOne
	private Bottom heroBottom;

	public Hero() {
	}

	public Hero(String heroName, Hair heroHair, Head heroHead, Top heroTop, Bottom heroBottom) {
		this.heroName = heroName;
		this.heroHair = heroHair;
		this.heroHead = heroHead;
		this.heroTop = heroTop;
		this.heroBottom = heroBottom;
	}

	public Long getHeroId() {
		return heroId;
	}

	public String getHeroName() {
		return heroName;
	}

	public Head getHeroHead() {
		return heroHead;
	}

	public Hair getHeroHair() {
		return heroHair;
	}

	public Top getHeroTop() {
		return heroTop;
	}

	public Bottom getHeroBottom() {
		return heroBottom;
	}

}
