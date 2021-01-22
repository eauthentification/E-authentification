package groupfour.RegistrationAndLogin.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Optional;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import groupfour.RegistrationAndLogin.Pojo.User;
import groupfour.RegistrationAndLogin.Repository.MobileOtpRepository;

@Service
public class MobileOtpService {
	
	@Autowired
	private MobileOtpRepository repo;
//	
//	public String fetchMobileNoAndOtp(long mobileno)
//	{
//		String message=null;
//		String otpStr=OtpGenerate.generateOtp(5);
//		User user=repo.findByMobileno(mobileno);
//		if(user==null)
//		{
//			   return "Invalid Mobile Number";
//		}
//	   user.setOtp(otpStr);
//	   repo.save(user);  
//	   message=sendSMS("Authentification OTP  : "+otpStr,mobileno);
//	   
//	   
//	   return message;
//	}
//
//	private String sendSMS(String message, long mobileno) {
//		// TODO Auto-generated method stub
//		
//		try {
//			String apiKey="otW6U4CaeBNIqkQdArZ2JcRwi1gfEzM09Hx7PYm8XVGhylsvSjAoXVaREzZ3qIh5eMcmSNbDFk7TOvJf";
//			String sendId="FSTSMS";
//			message=URLEncoder.encode(message,"UTF-8");
//			String language="english";
//			String route="p";
//			String myUrl=" https://www.fast2sms.com/dev/bulk?authorization="+apiKey+"&sender_id="+sendId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+mobileno;
//			
//			URL url=new URL(myUrl);
//			HttpsURLConnection con=(HttpsURLConnection)url.openConnection();
//			con.setRequestMethod("GET");
//			con.setRequestProperty("User-Agent", "Chrome/");
//			con.setRequestProperty("cache-control","no-cache");
//			System.out.println("Wait.....");
//			
//			
//			int code=con.getResponseCode();
//			System.out.println("Response code : "+code);
//			
//			StringBuffer response=new StringBuffer();
//			BufferedReader br=new BufferedReader(new java.io.InputStreamReader(con.getInputStream()));
//			while(true)
//			{
//				String line=br.readLine();
//				if(line==null)
//				{
//					break;
//				}
//				response.append(line);
//			}
//			System.out.println(response);
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		return "OTP successefully send to your registered mobile number";
//	}
//
//	
	
	

	public String fetchUserName(String username)
	{
		String message=null;
		String otpStr=OtpGenerate.generateOtp(5);
		User user=repo.getOne(username);
		long mobileno=user.getMobileno();
		
		if(user==null)
		{
			   return "Invalid User";
		}
	   user.setOtp(otpStr);
	   repo.save(user);  
	   message=sendSMS("Authentification OTP  : "+otpStr,mobileno);
	   
	   
	   return message;
	}

	private String sendSMS(String message, long mobileno) {
		// TODO Auto-generated method stub
		
		try {
			String apiKey="otW6U4CaeBNIqkQdArZ2JcRwi1gfEzM09Hx7PYm8XVGhylsvSjAoXVaREzZ3qIh5eMcmSNbDFk7TOvJf";
			String sendId="FSTSMS";
			message=URLEncoder.encode(message,"UTF-8");
			String language="english";
			String route="p";
			String myUrl=" https://www.fast2sms.com/dev/bulk?authorization="+apiKey+"&sender_id="+sendId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+mobileno;
			
			URL url=new URL(myUrl);
			HttpsURLConnection con=(HttpsURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "Chrome/");
			con.setRequestProperty("cache-control","no-cache");
			System.out.println("Wait.....");
			
			
			int code=con.getResponseCode();
			System.out.println("Response code : "+code);
			
			StringBuffer response=new StringBuffer();
			BufferedReader br=new BufferedReader(new java.io.InputStreamReader(con.getInputStream()));
			while(true)
			{
				String line=br.readLine();
				if(line==null)
				{
					break;
				}
				response.append(line);
			}
			System.out.println(response);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "OTP successefully send to your registered mobile number";
	}

	

}
