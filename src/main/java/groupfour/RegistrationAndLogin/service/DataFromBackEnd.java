package groupfour.RegistrationAndLogin.service;

public class DataFromBackEnd {
	public Boolean status;
	public String message;
	public DataFromBackEnd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DataFromBackEnd(Boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
