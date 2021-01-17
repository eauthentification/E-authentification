package groupfour.RegistrationAndLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import groupfour.RegistrationAndLogin.Pojo.User;

//Mobile OTP Repository Added

@Repository
public interface MobileOtpRepository extends JpaRepository<User,String> {
	public User findByMobileno(long mobileno);
}
