package groupfour.RegistrationAndLogin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import groupfour.RegistrationAndLogin.Pojo.User;
import groupfour.RegistrationAndLogin.Repository.RegisterRepository;

@RestController
public class RegistrationController {

	@Autowired
	private RegisterRepository service;
	
	@PostMapping("/register")
	@CrossOrigin(origins="http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempUsername = user.getUsername();
		if(tempUsername != null && !"".equals(tempUsername)){
			User userobj = service.findByUsername(tempUsername);
			if (userobj != null) {
				throw new Exception("user with "+tempUsername+" is already exist");
			}
		}
		User userObj = null;
		userObj = service.save(user);
		return userObj;
	
	}
	
	
}
