package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="genel_is_pozisyonlari")
public class GenelIsPozisyonlari {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String ad;

	public GenelIsPozisyonlari() {
		
	}
	public GenelIsPozisyonlari(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}
}
