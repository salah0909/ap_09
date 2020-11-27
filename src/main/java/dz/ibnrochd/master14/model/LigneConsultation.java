package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	@Column(name = "posologie", nullable = false, length = 255)
    private String posologie;
	@Temporal(TemporalType.TIMESTAMP)
    private TimeUnit unite_temps;
	@Column(name ="quantite" , nullable =false , length = 255)
	int quantite;
	
	@ManyToMany ()
	@JoinColumn(name = "id_traitement", nullable = false)
    private Traitement traitement;
	@JoinColumn(name = "id_consultation", nullable = false)
    private Consultation consultation;
	
	public LigneConsultation () {
		
	}
     public LigneConsultation (int id, String posologie, TimeUnit unite_temps, int quantite) {
    	 this.id=id;
    	 this.posologie=posologie;
    	 this.quantite=quantite;
		
	}
     public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public Traitement getTraitement() {
			return traitement;
		}

		public void setTraitement(Traitement traitement) {
			this.traitement = traitement;
		}
		public Consultation getConsultation() {
			return consultation;
		}

		public void setConsultation( Consultation consultation) {
			this.consultation = consultation;
		}
	
}
