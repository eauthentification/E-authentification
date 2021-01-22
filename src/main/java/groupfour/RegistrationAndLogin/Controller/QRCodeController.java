package groupfour.RegistrationAndLogin.Controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import groupfour.RegistrationAndLogin.Pojo.User;
import groupfour.RegistrationAndLogin.service.OtpGenerate;
import groupfour.RegistrationAndLogin.service.QRCodeService;

@RestController
public class QRCodeController {

	@Autowired
	private QRCodeService qr;
	
	

	/*
	  @PostMapping("/user/qrcode") public String sendQRCodetoMail(@RequestBody()
	  User u) {
	  
	  System.out.println(u.getEmailid()); String
	  result=qr.createQRCode(u.getEmailid());
	  
	  return "Generated";
	  
	  }
	 */
	
	@GetMapping("/user/qrcode{emailid}")
	public String sendQRCodetoMail(@PathParam("emailid") String emailid) throws Exception {
	  
		
	  //System.out.println(user.getEmailid()); 
	  String email=qr.fetchByEmailid(emailid);
	  if(email==null)
		{
			
			return "Invalid Email ID";
		}
	  
	  return "QR COde Generated";
	  
	  }
	
	

}
