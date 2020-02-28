package com.canal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Contrat {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_contrat")
	private int idContrat;
	private String canal;
	private String condition;
	//permet de prendre en compte le cas où les abonnés ont des contrats avec des adresses différentes
	private int idAdresse;
	private int idAbonne;
	
	public Contrat() {
		
	}
	
	public Contrat(int idContrat, String canal, String condition, int idAdresse, int idAbonne) {
		this.idContrat = idContrat;
		this.canal = canal;
		this.condition = condition;
		this.idAdresse = idAdresse;
		this.idAbonne = idAbonne;
	}
	
	
	
	
	

}
