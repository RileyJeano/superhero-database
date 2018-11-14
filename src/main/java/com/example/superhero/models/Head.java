package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Head {

	@Id
	@GeneratedValue
	private Long headId;
	private String head;

	@JsonIgnore
	@OneToOne
	private Hero hero;

	public Head() {

	}

	public Head(String head) {
		this.head = head;
	}

	public Long getHeadId() {
		return headId;
	}

	public String getHead() {
		return head;
	}

}
