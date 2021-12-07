package com.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Librarians")
@Component
public class Librarians {
	@Id // Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int LibId;
	private String libName;
	private String password;
	public Librarians() {
		super();
	}
	public Librarians(int libId, String libName, String password) {
		super();
		LibId = libId;
		this.libName = libName;
		this.password = password;
	}
	public int getLibId() {
		return LibId;
	}
	public void setLibId(int libId) {
		LibId = libId;
	}
	public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Librarians [LibId=" + LibId + ", libName=" + libName + ", password=" + password + "]";
	}

	
}
