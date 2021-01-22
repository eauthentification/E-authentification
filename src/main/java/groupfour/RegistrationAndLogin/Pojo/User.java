package groupfour.RegistrationAndLogin.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	//These are the changes
	// Otp Entity Added Here
	// Changed mobile_No Entity as mobileno

	@Id
	@Column(name = "user_name")
	private String username;

	private String password;
	private String first_Name;
	private String last_Name;
	private String emailid;
	private long mobileno;
	private String gender;
	private String otp;
	
	
	

	//Constructor Parameter Changed
	
	
	public User(String username, String password, String first_Name, String last_Name, String email_Id, long mobile_No,
			String gender, String otp) {
		super();
		this.username = username;
		this.password = password;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.emailid = email_Id;
		this.mobileno = mobile_No;
		this.gender = gender;
		this.otp = otp;
	}

	
	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	

	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", first_Name=" + first_Name + ", last_Name="
				+ last_Name + ", emailid=" + emailid + ", mobileno=" + mobileno + ", gender=" + gender + ", otp=" + otp
				+ "]";
	}

	

}
