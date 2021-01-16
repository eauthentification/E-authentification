package groupfour.RegistrationAndLogin.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;   

@Entity
public class User {

	
	
	
	@Id
	@Column(name = "user_name")
	private String username;
	
	private String password;
	private String first_Name;
	private String last_Name;
	private String email_Id;
	private long mobile_No;
	private String gender;
	
	
	public User(String username, String password, String first_Name, String last_Name, String email_Id, long mobile_No,
			String gender) {
		super();
		this.username = username;
		this.password = password;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email_Id = email_Id;
		this.mobile_No = mobile_No;
		this.gender = gender;
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


	public String getEmail_Id() {
		return email_Id;
	}


	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}


	public long getMobile_No() {
		return mobile_No;
	}


	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
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
				+ last_Name + ", email_Id=" + email_Id + ", mobile_No=" + mobile_No + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
}