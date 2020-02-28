package com.canal.service;

import java.util.List;

import com.canal.bean.Adresse;

public interface IAdresseService {

	public int updateAdresse(Adresse adresse);
	
	public List<Adresse> getAdresseByIdAbonne(int idAbonne);
}
