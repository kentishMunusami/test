package com.canal.bean;

import java.util.Date;

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
public class Mouvement {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="schema.sqlfrefe")
	private int idMouvement;
	private String typeModification;
	private Date dateModification;
	private int idAdresse;
	
	public Mouvement() {
		
	}

	public Mouvement(int idMouvement, String typeModification, Date dateModification, int idAdresse) {
		super();
		this.idMouvement = idMouvement;
		this.typeModification = typeModification;
		this.dateModification = dateModification;
		this.idAdresse = idAdresse;
	}
	
	
	
	

}
