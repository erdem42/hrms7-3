package kodlamaio.hrms.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="ePosta")
	private String ePosta;
	
	@Column(name="sifre")
	private String sifre;
}
