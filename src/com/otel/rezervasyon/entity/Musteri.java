package com.otel.rezervasyon.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Musteri implements Serializable{

	@Id
	@GeneratedValue
	private long Id;
	private String musteriAdi, musteriSoyadi, musteriCepTel, musteriEvTel, musteriIlce, musteriSehir, musteriEmail, musteriTC;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getMusteriAdi() {
		return musteriAdi;
	}
	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}
	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}
	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}
	public String getMusteriCepTel() {
		return musteriCepTel;
	}
	public void setMusteriCepTel(String musteriCepTel) {
		this.musteriCepTel = musteriCepTel;
	}
	public String getMusteriEvTel() {
		return musteriEvTel;
	}
	public void setMusteriEvTel(String musteriEvTel) {
		this.musteriEvTel = musteriEvTel;
	}
	public String getMusteriIlce() {
		return musteriIlce;
	}
	public void setMusteriIlce(String musteriIlce) {
		this.musteriIlce = musteriIlce;
	}
	public String getMusteriSehir() {
		return musteriSehir;
	}
	public void setMusteriSehir(String musteriSehir) {
		this.musteriSehir = musteriSehir;
	}
	public String getMusteriEmail() {
		return musteriEmail;
	}
	public void setMusteriEmail(String musteriEmail) {
		this.musteriEmail = musteriEmail;
	}
	public String getMusteriTC() {
		return musteriTC;
	}
	public void setMusteriTC(String musteriTC) {
		this.musteriTC = musteriTC;
	}

}

