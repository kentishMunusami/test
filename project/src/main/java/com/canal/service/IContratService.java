package com.canal.service;

import java.util.List;

import com.canal.bean.Contrat;

public interface IContratService {
	
	public List<Contrat> getContratByIdAbonne(int idAbonne);
	
	public List<Contrat> getContratByIdAdresse(int idAdresse);


}
