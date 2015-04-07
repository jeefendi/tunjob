package domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User implements Serializable {
	
	private Integer id;
	private String name;
	private String login;
	private String password;
	private Date date= new Date();
	private static final long serialVersionUID = 1L;
	
	
	
	
	public User() {
		super();
	}




	public User(String name) {
		super();
		this.name = name;
	}




	public User(Integer id, String name, String login, String password,
			Date date) {
		super();
		this.id = id;
		this.name = name;
		this.login = login;
		this.password = password;
		this.date = date;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLogin() {
		return login;
	}




	public void setLogin(String login) {
		this.login = login;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
