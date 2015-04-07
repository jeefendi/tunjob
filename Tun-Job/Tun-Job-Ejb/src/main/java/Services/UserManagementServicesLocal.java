package Services;


import java.util.List;

import javax.ejb.Local;

import domain.User;

@Local
public interface UserManagementServicesLocal {

	public User login(String login, String password);
	public Boolean addUser(User user);
	public Boolean update(User user);
	public Boolean delete(Integer id);
	public List<User> findAllUser() ;
	public User findUserById(Integer id);
}
