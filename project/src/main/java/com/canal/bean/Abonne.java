package com.canal.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Abonne implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_abonne")
	private int idAbonne;
	
	private String nom;
	private String prenom;

	@OneToMany(mappedBy="abonne",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<Adresse> adresses;
	
	public Abonne() {

	}

	public Abonne(int id, String nom, String prenom) {
		this.idAbonne = id;
		this.nom = nom;
		this.prenom = prenom;
	}
}
