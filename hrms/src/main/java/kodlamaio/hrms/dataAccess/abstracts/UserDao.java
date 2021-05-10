package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrms.entities.concretes.GenelIsPozisyonlari;

public interface UserDao extends JpaRepository<GenelIsPozisyonlari,Integer> {

}
