package com.canal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canal.bean.Mouvement;
import com.canal.service.IMouvementService;

@RestController
@RequestMapping("/mouvement")
public class MouvementController {
	@Autowired
	private IMouvementService mouvementService;
	
	@PostMapping("/")
    public ResponseEntity insertMouvement(@RequestBody Mouvement mouvement) {
        if(mouvementService.insertMouvement(mouvement) != 0){
        	return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(500).body("unable to update adresse");
    }
	
	@PostMapping("/{id}")
    public ResponseEntity getMouvementByIdAdresse(@PathVariable("idAdresse") int idAdresse) {
		return ResponseEntity.ok(mouvementService.getMouvementByIdAdresse(idAdresse));
    }
	

}
