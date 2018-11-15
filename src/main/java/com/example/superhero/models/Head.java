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
	private int headNumber;

	@JsonIgnore
	@OneToOne
	private Hero hero;

	public Head() {

	}

	public Head(String head, int headNumber) {
		this.head = head;
		this.headNumber = headNumber;
	}

	public int getHeadNumber() {
		return headNumber;
	}

	public Hero getHero() {
		return hero;
	}

	public Long getHeadId() {
		return headId;
	}

	public String getHead() {
		return head;
	}

}
