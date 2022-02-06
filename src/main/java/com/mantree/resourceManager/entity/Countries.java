package com.mantree.resourceManager.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
//@Data
public class Countries {

	@Id
	private Integer id;

	private String name;

	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
