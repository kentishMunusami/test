package com.canal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.canal.bean.Adresse;
import com.canal.service.IAdresseService;

@RestController
@RequestMapping("/adresse")
public class AdresseController {
	
	@Autowired
	private IAdresseService adresseService;
	
	@PutMapping("/")
    public ResponseEntity updateAdresse(@RequestBody Adresse adresse) {
        if(adresseService.updateAdresse(adresse) != 0){
        	return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(500).body("unable to update adresse");
    }
	
	@GetMapping("/{id}")
	 public ResponseEntity findAdresseByIdAbonne(@PathVariable("id") int id) {
		 return ResponseEntity.ok(adresseService.getAdresseByIdAbonne(id));
		 
	 }

}
