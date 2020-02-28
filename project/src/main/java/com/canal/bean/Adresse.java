package com.canal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Adresse {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_adresse")
	private int idAdresse;
	private boolean active;
	private String pays;
	private String rue;
	@Column(name="codepostal")
	private String codePostal;
	private String ville;
	
	
	@ManyToOne
	@JoinColumn(name="id_abonne")
	@JsonIgnore
	private Abonne abonne;
	
	public Adresse() {
		
	}

	public Adresse(int id, boolean active, String pays, String rue, String codePostal, String ville, Abonne abonne) {
		super();
		this.idAdresse = id;
		this.active = active;
		this.pays = pays;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.abonne = abonne;
	}
	
	
	
	


	
	
}
