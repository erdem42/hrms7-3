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
@Table(name="isVerenler")
public class IsVerenler extends Users{

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="sirketAdi")
	private String sirketAdi;
	
	@Column(name="webSitesi")
	private String webSitesi;
	
	@Column(name="telefon")
	private String telno;
	
	public IsVerenler() {
		super();
	}
	
	public IsVerenler(int id, String sirketAdi, String webSitesi, String telno) {
		super();
		this.id = id;
		this.sirketAdi = sirketAdi;
		this.webSitesi = webSitesi;
		this.telno = telno;
	}



	
}
