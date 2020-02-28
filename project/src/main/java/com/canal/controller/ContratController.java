package com.canal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canal.bean.Contrat;
import com.canal.service.IContratService;

@RestController
@RequestMapping("/contrat")
public class ContratController {
	
	@Autowired
	private IContratService contratService;
	
	@GetMapping("adresse/{idAdresse}")
    public ResponseEntity findContratByIdAdresse(@PathVariable("idAdresse") int idAdresse) {
		List<Contrat> contrats = contratService.getContratByIdAdresse(idAdresse);
		return ResponseEntity.ok(contrats);
	}
	
	@GetMapping("abonne/{idAbonne}")
    public ResponseEntity findContratByIdAbonne(@PathVariable("idAbonne") int idAbonne) {
		List<Contrat> contrats = contratService.getContratByIdAbonne(idAbonne);
		return ResponseEntity.ok(contrats);
	}

}
