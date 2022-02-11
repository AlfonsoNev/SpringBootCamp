package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="test")
public class User {
	//CLASE POJO DE USERS
	@Id
	private int id;
	private String name;
	private Date fecha;
	
	//CONSTRUCTOR
	public User() {
	}

	//G Y S
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
