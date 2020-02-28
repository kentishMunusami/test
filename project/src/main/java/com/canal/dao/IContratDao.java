package com.canal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canal.bean.Contrat;

public interface IContratDao extends JpaRepository<Contrat, Long> {
	
	public List<Contrat> findByidAbonne(int idAbonne);
	
	public List<Contrat> findByidAdresse(int idAdresse);

}
