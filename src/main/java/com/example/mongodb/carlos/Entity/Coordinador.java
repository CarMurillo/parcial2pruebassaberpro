package com.example.mongodb.carlos.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "coordinador")
public class Coordinador {

	@Id 
	private String id;
	private String user;
	private String password;
	private String nombre;
	private String apellido;
	
	public Coordinador() {
		// TODO Auto-generated constructor stub
	}


	public Coordinador(String id, String user, String password, String nombre, String apellido) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
