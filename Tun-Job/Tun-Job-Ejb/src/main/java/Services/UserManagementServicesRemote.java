package Services;

import javax.ejb.Remote;

import domain.User;

@Remote
public interface UserManagementServicesRemote {
	public User login(String login, String password);
	public Boolean addUser(User user);
	public Boolean update(User user);
	public Boolean delete(Integer id);
	//public List<User> findAllUser() ;
	public User findUserById(Integer id);
}
