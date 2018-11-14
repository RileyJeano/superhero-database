package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hair {

	@Id
	@GeneratedValue
	private Long hairId;
	private String hairStyle;

	public Hair() {
	}

	public Hair(String hairStyle) {
		this.hairStyle = hairStyle;
	}

	public Long getHairId() {
		return hairId;
	}

	public String getHairStyle() {
		return hairStyle;
	}
}
