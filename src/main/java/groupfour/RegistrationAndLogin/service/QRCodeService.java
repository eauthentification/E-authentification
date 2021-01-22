package groupfour.RegistrationAndLogin.service;


import java.nio.file.FileSystems;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import groupfour.RegistrationAndLogin.Pojo.User;
import groupfour.RegistrationAndLogin.Repository.QRCodeRepository;

@Service
public class QRCodeService {

	@Autowired
	private QRCodeRepository qr;
	
	public String fetchByEmailid(String emailid) throws Exception {
		
		String mail=null;
		
		//Code to generate random Code to pass in QR Code as a String
		String code=OtpGenerate.generateOtp(5);
		System.out.println("OTP Generated"+code);
		User user=qr.findByEmailid(emailid);
		if(user==null)
		{
			   return "Invalid emailid Number";
		}
	   user.setOtp(code);
	   qr.save(user);  
	   //mail=sendSMS("Authentification OTP  : "+otpStr,mobileno);
	   
	   
	   
		
		
		String generated=writeQrCode(emailid,code);
		
		
		
		
//		User u=qr.findByEmailid(emailid);
	//	System.out.println(u.getEmailid());
		
		
		return generated;
	}
	
	
	String QRCODE_PATH="D:\\QRCode\\";
	public String writeQrCode(String emailid,String code) throws Exception {
		String qrcode=QRCODE_PATH +emailid+".png";
		
		String content="Email Id :"+emailid+"\n"+"Code :"+code;
		QRCodeWriter writer=new QRCodeWriter();
		BitMatrix bitMatrix=writer.encode(content,BarcodeFormat.QR_CODE,350,350);
		
		Path path=FileSystems.getDefault().getPath(qrcode);
		
		MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
		return "QR code generated Successfully";
		
		
		
	}
	
	

}
