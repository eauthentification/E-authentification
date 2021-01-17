package groupfour.RegistrationAndLogin.service;

import java.util.SplittableRandom;

public class OtpGenerate {
	public static String generateOtp(int otpLength) {
		SplittableRandom splittableRandom=new SplittableRandom();
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <otpLength; i++) {
			sb.append(splittableRandom.nextInt(0,10));
		}
		return sb.toString();
	}
}
