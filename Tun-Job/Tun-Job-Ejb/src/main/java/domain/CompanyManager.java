package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class CompanyManager extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String NomCompany;
	private String DomaineActivite;
	private String ville;
	private String Adresse;
	private String Email;
	private String Tel;
	private String Fax;
	private String NomResponsable;
	private String FonctionResponsable;

	private List<JobOffer> JobOffers;

	public CompanyManager() {
		super();
	}

	public CompanyManager(String nomCompany, String domaineActivite,
			String ville, String adresse, String email, String tel, String fax,
			String nomResponsable, String fonctionResponsable) {
		super();

		NomCompany = nomCompany;
		DomaineActivite = domaineActivite;
		this.ville = ville;
		Adresse = adresse;
		Email = email;
		Tel = tel;
		Fax = fax;
		NomResponsable = nomResponsable;
		FonctionResponsable = fonctionResponsable;

	}

	public String getNomCompany() {
		return NomCompany;
	}

	public void setNomCompany(String nomCompany) {
		NomCompany = nomCompany;
	}

	public String getDomaineActivite() {
		return DomaineActivite;
	}

	public void setDomaineActivite(String domaineActivite) {
		DomaineActivite = domaineActivite;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public String getNomResponsable() {
		return NomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		NomResponsable = nomResponsable;
	}

	public String getFonctionResponsable() {
		return FonctionResponsable;
	}

	public void setFonctionResponsable(String fonctionResponsable) {
		FonctionResponsable = fonctionResponsable;
	}

	@OneToMany(mappedBy = "companymanager")
	public List<JobOffer> getJobOffers() {
		return JobOffers;
	}

	public void setJobOffers(List<JobOffer> jobOffers) {
		JobOffers = jobOffers;
	}

}
