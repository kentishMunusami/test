package com.canal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canal.bean.Mouvement;

public interface IMouvementDao extends JpaRepository<Mouvement, Long> {
	
	
	public List<Mouvement> findByidAdresse(int idAdresse);

}
