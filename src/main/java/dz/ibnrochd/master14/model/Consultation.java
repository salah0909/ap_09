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
	
	@OneToMany(mappedBy = "consultation")
    private List<LigneConsultation> ligneconsultations = new ArrayList<>();
	
	@ManyToOne()
	@JoinColumn(name = "id_patient", nullable = false)
	private Patient patient;
	 
	public Consultation() {
		
	}

	public Consultation(int id, String motif, Date date_consultation, Patient patient) {
		super();
		this.id = id;
		this.motif = motif;
		this.date_consultation = date_consultation;
		this.patient = patient;
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

	public Date getDate_consultation() {
		return date_consultation;
	}

	public void setDate_consultation(Date date_consultation) {
		this.date_consultation = date_consultation;
	}

	public List<LigneConsultation> getLigneconsultations() {
		return ligneconsultations;
	}

	public void setLigneconsultations(List<LigneConsultation> ligneconsultations) {
		this.ligneconsultations = ligneconsultations;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
