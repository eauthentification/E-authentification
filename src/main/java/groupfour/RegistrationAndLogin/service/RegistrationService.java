package groupfour.RegistrationAndLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupfour.RegistrationAndLogin.Pojo.User;
import groupfour.RegistrationAndLogin.Repository.RegisterRepository;

@Service
public class RegistrationService {
	
	@Autowired 
	private RegisterRepository repo;
	
	public User saveUser(User user) {
		
		return repo.save(user);
		
	}
	public User fetchUserByUsername(String username) {
		return repo.findByUsername(username);
	}
	public User fetchUserByUsernameAndPassword(String username,String password) {
		return repo.findByUsernameAndPassword(username,password);
	}
}
