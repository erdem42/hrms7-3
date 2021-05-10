package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.Users;
import lombok.Data;


@Entity
@Data
@Table(name="IsArayanlar")
public class IsArayanlar extends Users{

	 @Id
	 @GeneratedValue
	 @Column(name="id")
	 private int id;
	 
	 @Column(name="ad")
	 private String ad;
	 
	 @Column(name="soyad")
	 private String soyad;
	 
	 @Column(name="tcno")
	 private String tcno;
	 
	 @Column(name="dogumYili")
	 private Date dogumYili;

	public IsArayanlar() {
		super();
	}

	public IsArayanlar(int id, String ad, String soyad, String tcno, Date dogumYili) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.tcno = tcno;
		this.dogumYili = dogumYili;
	}
	 


}
