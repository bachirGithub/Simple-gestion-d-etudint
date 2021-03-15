package com.example.demo.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

@Entity
public class Etudiant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="Le champ nom ne doit pas être vide")
	private String nom;
	@NotNull(message="La date est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNaissance;
	@NotBlank(message="Le champ nom ne doit pas être vide")
	@Email(message="Ceci n'est pas un email valide")
	private String email;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(String nom, Date dateNaissance, String email) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
