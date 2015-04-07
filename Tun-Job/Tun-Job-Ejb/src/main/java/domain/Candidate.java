package domain;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Candidate extends User {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Nom;
	private String Prenom;
	private String Proffesion;
	private String Email;
	private String Sexe;
	private int Tel;
	private int Age;
	
	private List<JobOffer> JobOffers;
	public Candidate() {
		super();
	}


	public Candidate(int idCandidate, String nom, String prenom, String login,
			String passeword, String proffesion, String email, String sexe,
			int tel, int age) {
		super();
		
		Nom = nom;
		Prenom = prenom;
		Proffesion = proffesion;
		Email = email;
		Sexe = sexe;
		Tel = tel;
		Age = age;
	}

	
	




	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	


	public String getProffesion() {
		return Proffesion;
	}


	public void setProffesion(String proffesion) {
		Proffesion = proffesion;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getSexe() {
		return Sexe;
	}


	public void setSexe(String sexe) {
		Sexe = sexe;
	}


	public int getTel() {
		return Tel;
	}


	public void setTel(int tel) {
		Tel = tel;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}

@ManyToMany
	public List<JobOffer> getJobOffers() {
		return JobOffers;
	}


	public void setJobOffers(List<JobOffer> jobOffers) {
		JobOffers = jobOffers;
	}
	
	
	
	
	
}
