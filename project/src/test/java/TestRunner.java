import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.canal.bean.Abonne;
import com.canal.bean.Contrat;
import com.canal.bean.Mouvement;
import com.canal.dao.IAbonneDao;
import com.canal.dao.IAdresseDao;
import com.canal.dao.IMouvementDao;
import com.canal.service.impl.AbonneService;
import com.canal.service.impl.AdresseService;
import com.canal.service.impl.MouvementService;




public class TestRunner {
    
    @InjectMocks
    AbonneService abonneService;
    @InjectMocks
    AdresseService adresseService;
    @InjectMocks
    MouvementService mouvementService;
    
    @Mock
    IAbonneDao abonneDao;
    @Mock
    IAdresseDao adresseDao;
    @Mock
    IMouvementDao mouvementDao;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void recuperationAbonne() {
    	Abonne abonne = new Abonne(1, "munusami", "kentish");
        when(abonneDao.findByidAbonne(1)).thenReturn(abonne);
        assertEquals("munusami", abonneService.getAbonneById(1).getNom());
    }
    
//    @Test
//    public void modificationAdresse() {
//    	
//    	Abonne abonne = new Abonne(1, "munusami", "kentish");
//        when(abonneDao.findByidAbonne(1)).thenReturn(abonne);
//        System.out.println(abonneService.getAbonneById(1));
//        
//    	
////    	Adresse adresse1 = new Adresse(1, false, "france","5 rue voltaire", "75008", "paris", 1);
////	    Adresse adresse2 = new Adresse(2, true, "pologne", "10 rue voltai", "", "varsovie", 1);
////	    Adresse adresse3 = new Adresse(3, true, "france", "12 rue de la paix", "75009", "paris", 1);
////	    List<Adresse> adresses = new ArrayList<Adresse>();
////	    adresses.add(adresse1);
////	    adresses.add(adresse2);
////	    adresses.add(adresse3);
//	     
//	    Contrat contrat1 = new Contrat(1, "FACE", "avec date effet", 1, 1);
//	    Contrat contrat2 = new Contrat(2, "EC", "avec date effet", 2, 1);
//	    Contrat contrat3 = new Contrat(3, "FACE", "avec date effet", 3, 1);
//
//	    List<Contrat> contrats = new ArrayList<Contrat>();
//	    contrats.add(contrat1);
//	    contrats.add(contrat2);
//	    contrats.add(contrat3);
//	    
//	    Mouvement mouvement = null;
//	    
////    	if("france".equals(adresse1.getPays().toLowerCase())) {
////    		when(adresseDao.updateAdresse(adresse1)).thenReturn(new Adresse(1, true, "france", "6 rue voltaire", "75008", "paris", 1));
////    		mouvement = new Mouvement(1, "modification adresse", new Date(), adresse1.getIdAdresse());
////    	}
////	    if(!"france".equals(adresse2.getPays().toLowerCase())) {
////	    	when(adresseDao.updateAdresse(adresse2)).thenReturn(null);
////	    }
//	    
//	    
//	    
////	    Adresse adresseUpdated = adresseService.updateAdresse(adresse1);
////	    Adresse adresseUpdated2 = adresseService.updateAdresse(adresse2);
////	    //on vérifie que l'adresse a bien changé et donc que le contrat qui référence cette adresse a bien pris en compte la modification
////	    assertNotEquals(adresse1.getRue(), adresseUpdated.getRue());
////	    //lorsque le pays n'est pas france, on obtient null car on ne doit pas modifier l'adresse (on ne doit jamais se retrouver 
////	    //dans cette situation car l'interface graphique va griser la modification lorsque le pays est différent de france
////	    assertNull(adresseUpdated2);
////	    //on vérifie qu'un mouvement a été créé après la modification de l'adresse
////	    if(mouvement != null) {
////	    	assertEquals(mouvement.getIdAdresse(), adresse1.getIdAdresse());
////	    }
////    	
//    }
 

}