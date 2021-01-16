package groupfour.RegistrationAndLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import groupfour.RegistrationAndLogin.Pojo.User;

@Repository
public interface RegisterRepository extends JpaRepository<User,String> {
	
	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username,String password);

}