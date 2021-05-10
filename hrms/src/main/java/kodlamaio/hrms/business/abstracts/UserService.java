package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.GenelIsPozisyonlari;

public interface UserService {

	List<GenelIsPozisyonlari> getAll();
}
