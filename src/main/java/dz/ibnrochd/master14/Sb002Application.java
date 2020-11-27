package dz.ibnrochd.master14;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.RendezVousRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.LigneConsultation;
import dz.ibnrochd.master14.model.Patient;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	ConsultationRepository consultationRpository;
	RendezVousRepository rendezVousRepository;
	TraitementRepository traitementRepository;
	LigneConsultation ligneConsultationRepository;
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		patientRepository.findAll();
		
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		
		patientRepository.findByNom("Yahi");
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
       
		patientRepository.save(new Patient(50,"Mohamadi","Mohamed","Male",new Date (28/03/1994),"0555","Blida"));
				
		// TODO : rechercher la consultation ayant id=3 
		consultationRpository.findById(3);

		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		traitementRepository.findAll();
	}

}
