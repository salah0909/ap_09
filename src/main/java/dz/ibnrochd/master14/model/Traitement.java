package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(schema = "cabinet", name = "traitement")
public class Traitement<Public> implements Serializable {

	private static final long serialVersionUID = 8248365590951840055L;
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name = "nom", nullable = false, length = 255)
    private String nom; 
	@OneToMany(mappedBy = "Traitement")
    private List<LigneConsultation> Ligneconsultations = new ArrayList<>();
	
	
	public Traitement () {
		
	  }
	public Traitement (int id, String nom) {
		  this.id=id;
		  this.nom=nom;
		   
	  }
	  public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		public List<LigneConsultation> getLigneconsultations() {
			return Ligneconsultations;
		}

		public void setLigneconsultations(List<LigneConsultation> Ligneconsultations) {
			this.Ligneconsultations = Ligneconsultations;
		
		}
    
}
