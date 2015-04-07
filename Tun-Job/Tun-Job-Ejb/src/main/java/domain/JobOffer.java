package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class JobOffer {

	private int id;
	private String Reference;
	private Categories Categories;
	private String Description;
	private int NBPlace;
	private CompanyManager companymanager;
    private List<Candidate> candidat;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobOffer() {
		super();
	}

	public String getReference() {
		return Reference;
	}

	public void setReference(String reference) {
		Reference = reference;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getNBPlace() {
		return NBPlace;
	}

	public void setNBPlace(int nBPlace) {
		NBPlace = nBPlace;
	}

	@ManyToOne
	public Categories getCategories() {
		return Categories;
	}

	public void setCategories(Categories categories) {
		Categories = categories;
	}
@ManyToMany
	public List<Candidate> getCandidat() {
		return candidat;
	}

	public void setCandidat(List<Candidate> candidat) {
		this.candidat = candidat;
	}
	@ManyToOne
	public CompanyManager getCompanymanager() {
		return companymanager;
	}

	public void setCompanymanager(CompanyManager companymanager) {
		this.companymanager = companymanager;
	}

}
