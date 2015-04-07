package Services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import domain.User;

/**
 * Session Bean implementation class UserManagementServices
 */
@Stateless
@LocalBean
public class UserManagementServices implements UserManagementServicesRemote, UserManagementServicesLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	private EntityManager entityManager;
    public UserManagementServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User login(String login, String password) {
		User user = null;
		String jpql = "select u from User u where u.login =:param1 and u.password =:param2 ";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param1", login);
		query.setParameter("param2", password);
		try {
			user = (User) query.getSingleResult();
		} catch (Exception e) {
			System.out.println("user not found ");
		}
		return user;

	}
	

	@Override
	public Boolean addUser(User user) {
		Boolean b = false;
		try {
			entityManager.persist(user);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean update(User user) {
		boolean b = false;

		try {

			entityManager.merge(user);

			b = true;

		} catch (Exception e) {

		}

		return b;
	}

	@Override
	public Boolean delete(Integer id) {
		boolean b = false;

		try {

			entityManager.remove(findUserById(id));

			b = true;

		} catch (Exception e) {

		}

		return b;
	}

	@Override
	public User findUserById(Integer id) {
		 User userFound=null;
		    try {
				
		    	userFound=entityManager.find(User.class,id);
		    	
			} catch (Exception e) {
				System.err.println("User not found");
			}
				return userFound;
	}

	@Override
	public List<User> findAllUser() {
		String jpql = "select u from User u " ;
		Query query = entityManager.createQuery(jpql);
		
		try {
		
			return  query.getResultList();
		} catch (Exception e) {
			System.err.println("user not found");
			
		}		return null;
	}
	

}
