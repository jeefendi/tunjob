package mBeans;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import Services.UserManagementServicesLocal;
import domain.Candidate;
import domain.User;
import domain.CompanyManager;


@ManagedBean(name = "lb")
@SessionScoped
public class LoginBean {
	private User user = new User();
	@EJB
	private UserManagementServicesLocal userManagementServicesLocal;

	public String doLogin() {
		User userFounded = userManagementServicesLocal.login(user.getLogin(),
				user.getPassword());
		if (userFounded != null) {
			user = userFounded;
			if (userFounded instanceof Candidate) {
				return "/pages/hello";
			} else {
				return "/pages/hello2";
			}

		} else {
			return "/index";
		}

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
