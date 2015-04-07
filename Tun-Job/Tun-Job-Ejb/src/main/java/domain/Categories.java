package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categories implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idcategorie;
	private String namecategorie;
	private List<JobOffer> JobOffers;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	public Long getIdcategorie() {
		return idcategorie;
	}

	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}

	public String getNomcategorie() {
		return namecategorie;
	}

	public void setNomcategorie(String nomcategorie) {
		this.namecategorie = nomcategorie;
	}

	@OneToMany(mappedBy = "categories")
	public List<JobOffer> getJobOffers() {
		return JobOffers;
	}

	public void setJobOffers(List<JobOffer> jobOffers) {
		JobOffers = jobOffers;
	}

	public Categories() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Categories(String nomcategorie, String lettremotivation, byte[] cv,
			String nomCV) {
		super();
		this.namecategorie = nomcategorie;

	}

}
