package groupfour.RegistrationAndLogin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import groupfour.RegistrationAndLogin.Pojo.User;


@Repository
public interface QRCodeRepository extends JpaRepository<User, String> {
	

	public User findByEmailid(String emailid);
}
