package com.canal.service;

import java.util.List;

import com.canal.bean.Mouvement;

public interface IMouvementService {
	
	public int insertMouvement(Mouvement mouvement);
	
	public List<Mouvement> getMouvementByIdAdresse(int idAdresse);

}
