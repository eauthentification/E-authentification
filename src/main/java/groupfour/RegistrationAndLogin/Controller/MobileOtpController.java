package groupfour.RegistrationAndLogin.Controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import groupfour.RegistrationAndLogin.service.DataFromBackEnd;
import groupfour.RegistrationAndLogin.service.MobileOtpService;

@RestController
public class MobileOtpController {
	@Autowired
	private MobileOtpService mob;
	
//	@GetMapping("/user/mobileno{mobileno}")
//	public DataFromBackEnd fetchMobileNoAndOtp(@PathParam("mobileno") long mobileno)
//	{
//		DataFromBackEnd data=new DataFromBackEnd();
//		
//		
//		String message=mob.fetchMobileNoAndOtp(mobileno);
//		if(message==null)
//		{
//			data.setStatus(false);
//			data.setMessage("Enter Valid Mobile no");
//			return data;
//		}
//		//System.out.println(user.getFirst_Name());
//		data.setStatus(true);
//		data.setMessage(message);
//		return data;
//	}
	
	@GetMapping("/user/otp{user}")
	public DataFromBackEnd fetchMobileNoAndOtp(@PathParam("user") String user)
	{
		DataFromBackEnd data=new DataFromBackEnd();
		
		
		String message=mob.fetchUserName(user);
		if(message==null)
		{
			data.setStatus(false);
			data.setMessage("Enter Valid Mobile no");
			return data;
		}
		//System.out.println(user.getFirst_Name());
		data.setStatus(true);
		data.setMessage(message);
		return data;
	}
	
}
