package dz.ibnrochd.master14;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.RendezVousRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;

@SpringBootApplication
public class Sb002Application<patient> implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	ConsultationRepository consultationRpository;
	@Autowired
	RendezVousRepository rendezVousRepository;
	@Autowired
	TraitementRepository traitementRepository;
	@Autowired
	LigneConsultationRepository ligneConsultationRepository;
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		 
		List<Patient> p=patientRepository.findAll();
		 System.out.println(p);
		
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		
		List<Patient> pat=patientRepository.findByNom("Yahi");
		System.out.println(pat);
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
       
		                                           // sexe = varchar(1)
		Patient Pati=new Patient(0,"Mohamadi","Mohamed","M",new Date (28/03/1994),"0555","Blida");
		patientRepository.save(Pati);
		
				
		// TODO : rechercher la consultation ayant id=3 
		
		List<Consultation> c=consultationRpository.findById(3);
		System.out.println(c);

		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		
		List<Traitement> t=traitementRepository.findAll();
		System.out.println(t);
		
	}

}
