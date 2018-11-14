package com.example.superhero.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Head {

	@Id
	@GeneratedValue
	private Long headId;
	private String head;

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
