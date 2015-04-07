package mBeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import Services.UserManagementServicesLocal;

import domain.User;
@ManagedBean(name = "U")
@RequestScoped
public class UserManagedBean {
	private User user = new User();
	private DataModel<User> datamodel = new ListDataModel<>();
	private List<User> users = new ArrayList<>();
	private User userSelected=new User();
	@EJB
	private UserManagementServicesLocal userManagementServicesLocal;

	public String doAddUser() {
		userManagementServicesLocal.addUser(user);
		return "";
	}
	
	public String doBeforeUpdateUser(User user)
	{
		
	    userSelected.setId(user.getId());
	    userSelected.setName(user.getName());
	    userSelected.setLogin(user.getLogin());
	    userSelected.setPassword(user.getPassword());
		return "/pages/updateUser";
	}
	public String doUpdateUser()
	{
		userManagementServicesLocal.update(userSelected);
		return "/pages/ListeUsers";
	}
	public String doDeleteUser()
	{
		try{
		userSelected=datamodel.getRowData();
		userManagementServicesLocal.delete(userSelected.getId());
		return "";
		}
		catch(Exception ex)
		{
		System.err.println(ex.getMessage());
		return"";
		}
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public DataModel<User> getDatamodel() {
		datamodel.setWrappedData(userManagementServicesLocal.findAllUser());
		return datamodel;
	}
	public void setDatamodel(DataModel<User> datamodel) {
		this.datamodel = datamodel;
	}
	public User getUserSelected() {
		
		return userSelected;
	}
	public void setUserSelected(User userSelected) {
		this.userSelected = userSelected;
		
	}
	public List<User> getUsers() {
		users = userManagementServicesLocal.findAllUser();
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}

}
