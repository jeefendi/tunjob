package domain;

import java.io.Serializable;

public class Choice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private int place;
	private JobOffer  JobOffer;
	private CompanyManager CampanyManager ;
	private String designation;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	public JobOffer getJobOffer() {
		return JobOffer;
	}
	public void setJobOffer(JobOffer jobOffer) {
		JobOffer = jobOffer;
	}
	public CompanyManager getCampanyManager() {
		return CampanyManager;
	}
	public void setCampanyManager(CompanyManager campanyManager) {
		CampanyManager = campanyManager;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Choice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Choice(int place, domain.JobOffer jobOffer,
			domain.CompanyManager campanyManager, String designation) {
		super();
		this.place = place;
		JobOffer = jobOffer;
		CampanyManager = campanyManager;
		this.designation = designation;
	}
	
}
