package com.canal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canal.service.IAbonneService;

@RestController
@RequestMapping("/abonne")
public class AbonneController {
	
	@Autowired
	private IAbonneService abonneService;
	
	 @GetMapping("/{id}")
	 public ResponseEntity findAbonneById(@PathVariable("id") int id) {
		 return ResponseEntity.ok(abonneService.getAbonneById(id));
		 
	 }
	

}
