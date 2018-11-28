package com.example.paperDoll.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Base {

	@Id
	@GeneratedValue
	private Long baseId;
	private String baseName;
	private String baseImage;

	@JsonIgnore
	@OneToOne
	private Head dollHead;

	@JsonIgnore
	@OneToOne
	private Hair heroHair;

	@JsonIgnore
	@OneToOne
	private Top heroTop;

	public Base() {
	}

	public Base(String baseName, String baseImage) {
		this.baseName = baseName;
		this.baseImage = baseImage;
	}

	public String getHeroImage() {
		return baseImage;
	}

	public Long getHeroId() {
		return baseId;
	}

	public String getHeroName() {
		return baseName;
	}

	public Head getHeroHead() {
		return dollHead;
	}

	public Hair getHeroHair() {
		return heroHair;
	}

	public Top getHeroTop() {
		return heroTop;
	}

}
