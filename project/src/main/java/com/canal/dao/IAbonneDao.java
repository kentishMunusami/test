package com.canal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.canal.bean.Abonne;

public interface IAbonneDao extends JpaRepository<Abonne, Long> {
	Abonne findByidAbonne(int idAbonne);

}
