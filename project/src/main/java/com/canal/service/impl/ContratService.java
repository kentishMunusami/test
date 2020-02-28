package com.canal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.canal.bean.Contrat;
import com.canal.dao.IContratDao;
import com.canal.service.IContratService;

@Service
public class ContratService implements IContratService {

	@Autowired
    private IContratDao contratDao;

	@Override
	public List<Contrat> getContratByIdAbonne(int idAbonne) {
		return contratDao.findByidAbonne(idAbonne);
	}

	@Override
	public List<Contrat> getContratByIdAdresse(int idAdresse) {
		return contratDao.findByidAdresse(idAdresse);
	}
	


}
