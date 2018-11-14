package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bottom {

	@Id
	@GeneratedValue
	private Long bottomId;
	private String bottom;

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
