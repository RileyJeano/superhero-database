package com.example.paperDoll.models;

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
	private int topNumber;

	@JsonIgnore
	@OneToOne
	private Base base;

	public Top() {
	}

	public Top(String top, int topNumber) {
		super();
		this.top = top;
		this.topNumber = topNumber;
	}

	public int getTopNumber() {
		return topNumber;
	}

	public Base getHero() {
		return base;
	}

	public Long getTopId() {
		return topId;
	}

	public String getTop() {
		return top;
	}

}
