package groupfour.RegistrationAndLogin.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import groupfour.RegistrationAndLogin.Pojo.Login;
import groupfour.RegistrationAndLogin.Pojo.User;

import groupfour.RegistrationAndLogin.Repository.RegisterRepository;


@RestController
public class LoginController {

	private RegisterRepository service;
	
	@Autowired
	public LoginController(RegisterRepository r)
	{
		this.service = r;
	}

	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception{
		String tempUsername = user.getUsername();
		String tempPass = user.getPassword();
		User userObj = null;
		if(tempUsername !=null && tempPass != null) {
			userObj = service.findByUsernameAndPassword(tempUsername,tempPass);
		}
		
		
		if(userObj == null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
	
	}
