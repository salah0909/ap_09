package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "cabinet", name = "consultation")
public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

	@Column(name = "motif", nullable = false, length = 255)
    private String motif; 
	@Column(name = "date_consultation", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date date_consultation;
	@OneToMany(mappedBy = "Consultation")
    private List<LigneConsultation> Ligneconsultations = new ArrayList<>();
	
	 @ManyToOne()
	    @JoinColumn(name = "id_patient", nullable = false)
	    private Patient patient;
	 
	public Consultation () {
		
	} 
	public Consultation (int id, String motif, Date date_consultation) {
		this.id=id;
		this.motif=motif;
		this.date_consultation=date_consultation;
	}
	 public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public String getMotif() {
			return motif;
		}

		public void setMotif(String motif) {
			this.motif = motif;
		}
		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}
		public List<LigneConsultation> getLigneConsultations() {
			return Ligneconsultations;
		}

		public void setLigneConsultation(List<LigneConsultation> Ligneconsultations) {
			this.Ligneconsultations = Ligneconsultations;
		}

}
