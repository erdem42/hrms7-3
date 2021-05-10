package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.Users;
import lombok.Data;

@Entity
@Data
@Table(name="sistemPersonelleri")
public class SistemPersonelleri extends Users{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="ad")
	private String ad;	
	
	@Column(name="soyad")
	private String soyad;

	public SistemPersonelleri() {
		super();
	}

	public SistemPersonelleri(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}


}
