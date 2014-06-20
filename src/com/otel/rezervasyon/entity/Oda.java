package com.otel.rezervasyon.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Oda implements Serializable {
	@Id
	@GeneratedValue
	private Long Id;
	private int o_KisiSayisi, geceUcreti;
	public String odaNo, rezervasyonOdaNo;
	private int odaDurumu;
	private String odaTipi;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public int getO_KisiSayisi() {
		return o_KisiSayisi;
	}

	public void setO_KisiSayisi(int o_KisiSayisi) {
		this.o_KisiSayisi = o_KisiSayisi;
	}

	public int getGeceUcreti() {
		return geceUcreti;
	}

	public void setGeceUcreti(int geceUcreti) {
		this.geceUcreti = geceUcreti;
	}

	public String getOdaNo() {
		return odaNo;
	}

	public void setOdaNo(String odaNo) {
		this.odaNo = odaNo;
	}

	public String getRezervasyonOdaNo() {
		return rezervasyonOdaNo;
	}

	public void setRezervasyonOdaNo(String rezervasyonOdaNo) {
		this.rezervasyonOdaNo = rezervasyonOdaNo;
	}

	public int getOdaDurumu() {
		return odaDurumu;
	}

	public void setOdaDurumu(int odaDurumu) {
		this.odaDurumu = odaDurumu;
	}

	public String getOdaTipi() {
		return odaTipi;
	}

	public void setOdaTipi(String odaTipi) {
		this.odaTipi = odaTipi;
	}

}
