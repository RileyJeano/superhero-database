package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Top {

	@Id
	@GeneratedValue
	private Long topId;
	private String top;

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
