package com.canal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.canal.bean.Adresse;

public interface IAdresseDao extends JpaRepository<Adresse, Long> {
	
	@Modifying
	@Query("update Adresse set active = :active, pays = :pays, rue = :rue, codePostal = :codepostal, ville = :ville where id_adresse = :idAdresse")
	public int updateAdresse(@Param("active") boolean active, @Param("pays") String pays, @Param("rue") String rue, 
			@Param("ville") String ville, @Param("idAdresse") int idAdresse);
	
	public List<Adresse> findByAbonne_IdAbonne(int idAbonne);
	

}
