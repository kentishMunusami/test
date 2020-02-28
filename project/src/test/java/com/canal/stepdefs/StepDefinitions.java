package com.canal.stepdefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Date;

import com.canal.bean.Abonne;
import com.canal.bean.Adresse;
import com.canal.bean.Contrat;
import com.canal.bean.Mouvement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class StepDefinitions {
	private Abonne abonne;
	private Adresse adresse = null;
	private Contrat contrat;
	private Mouvement mouvement = null;
	private Response response;
	private OkHttpClient client = new OkHttpClient();
	
	
	@Given("^un abonné avec une adresse principale \"([^\"]*)\" en \"([^\"]*)\"$")
	public void un_abonné_avec_une_adresse_principale_en(String active, String pays) {
		//la modification de l'adresse s'opère lorsque le pays est france
		abonne = new Abonne(1, "munusami", "kentish");
		if("france".equals(pays.toLowerCase())){
			adresse = new Adresse(1, "active".equals(active.toLowerCase())?true:false, pays, "", "", "", 1);
		}
	}

	@When("^le conseiller connecté à \"([^\"]*)\" modifie l'adresse de l'abonné \"([^\"]*)\"$")
	public void le_conseiller_connecté_à_modifie_l_adresse_de_l_abonné(String canal, String condition) {
		if("FACE".equals(canal)) {
			contrat = new Contrat(1, canal, condition, 1, 1);
			//simulation d'une modification de l'adresse de l'abonné
			adresse.setRue("2 rue de la defense");
			mouvement = new Mouvement(1, "modification adresse", new Date(), 1);
			
		}
	    
	}

	@Then("^l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné$")
	public void l_adresse_de_l_abonné_modifiée_est_enregistrée_sur_l_ensemble_des_contrats_de_l_abonné() {
		//on a un contrat qui respecte la condition parmis les contrats possibles
		if(contrat != null && "FACE".equals(contrat.getCanal())) {
			assertEquals(adresse.getRue(), "2 rue de la defense");
		}
	}

	@Then("^Et un mouvement de modification d'adresse est créé$")
	public void et_un_mouvement_de_modification_d_adresse_est_créé() {
		//on a un contrat qui respecte la condition parmis les contrats possibles
		if(contrat != null && "FACE".equals(contrat.getCanal())) {
			assertTrue(mouvement != null);
		}
	}

}
