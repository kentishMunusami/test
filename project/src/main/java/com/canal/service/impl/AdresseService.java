package com.canal.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canal.bean.Adresse;
import com.canal.bean.Mouvement;
import com.canal.dao.IAdresseDao;
import com.canal.dao.IMouvementDao;
import com.canal.service.IAdresseService;

@Service
public class AdresseService implements IAdresseService {

	@Autowired
    private IAdresseDao adresseDao;
	
	@Autowired
	private IMouvementDao mouvementDao;
	
	public int updateAdresse(Adresse adresseUpdate) {
		int idAdresse = adresseDao.updateAdresse(adresseUpdate.isActive(), adresseUpdate.getPays(), adresseUpdate.getRue(), adresseUpdate.getVille(), adresseUpdate.getIdAdresse());
		int id = (int) Math.random();
		Mouvement mouvement = new Mouvement(id,"modification adresse", new Date(), idAdresse);
		mouvementDao.save(mouvement);
		return idAdresse;
	}

	@Override
	public List<Adresse> getAdresseByIdAbonne(int idAbonne) {
		return adresseDao.findByAbonne_IdAbonne(idAbonne);
	}
}
