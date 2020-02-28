package com.canal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canal.bean.Mouvement;
import com.canal.dao.IMouvementDao;
import com.canal.service.IMouvementService;

@Service
public class MouvementService implements IMouvementService {
	@Autowired
	private IMouvementDao mouvementDao;
	
	public int insertMouvement(Mouvement mouvement) {
		return mouvementDao.save(mouvement).getIdMouvement();
	}

	@Override
	public List<Mouvement> getMouvementByIdAdresse(int idAdresse) {
		return mouvementDao.findByidAdresse(idAdresse);
	}

}
