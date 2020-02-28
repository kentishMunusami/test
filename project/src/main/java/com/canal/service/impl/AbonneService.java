package com.canal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canal.bean.Abonne;
import com.canal.dao.IAbonneDao;
import com.canal.service.IAbonneService;

@Service
public class AbonneService implements IAbonneService {
	
	@Autowired
    private IAbonneDao abonneDaoJpa;
	
	public Abonne getAbonneById(int id) {
		return abonneDaoJpa.findByidAbonne(id);
	}

}
