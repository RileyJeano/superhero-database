package com.example.paperDoll.models;

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
	private Base base;

	public Head() {

	}

	public Head(String head, int headNumber) {
		this.head = head;
		this.headNumber = headNumber;
	}

	public int getHeadNumber() {
		return headNumber;
	}

	public Base getHero() {
		return base;
	}

	public Long getHeadId() {
		return headId;
	}

	public String getHead() {
		return head;
	}

}
