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
	private String heroImage;

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

	public Hero(String heroName, String heroImage, Hair heroHair, Head heroHead, Top heroTop, Bottom heroBottom) {
		this.heroName = heroName;
		this.heroImage = heroImage;
		this.heroHair = heroHair;
		this.heroHead = heroHead;
		this.heroTop = heroTop;
		this.heroBottom = heroBottom;
	}

	public String getHeroImage() {
		return heroImage;
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
