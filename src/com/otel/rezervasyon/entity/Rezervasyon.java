package com.otel.rezervasyon.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rezervasyon implements Serializable {
	
	@Id
	@GeneratedValue
	private long Id;
	private String odaNo,musteriAdi, musteriSoyadi, odemeTuru, musteriCepTel, girisTarihi, cikisTarihi;
    private int r_KisiSayisi, geceSayisi, toplamUcret;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getOdaNo() {
		return odaNo;
	}
	public void setOdaNo(String odaNo) {
		this.odaNo = odaNo;
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
	public String getOdemeTuru() {
		return odemeTuru;
	}
	public void setOdemeTuru(String odemeTuru) {
		this.odemeTuru = odemeTuru;
	}
	public String getMusteriCepTel() {
		return musteriCepTel;
	}
	public void setMusteriCepTel(String musteriCepTel) {
		this.musteriCepTel = musteriCepTel;
	}
	public String getGirisTarihi() {
		return girisTarihi;
	}
	public void setGirisTarihi(String girisTarihi) {
		this.girisTarihi = girisTarihi;
	}
	public String getCikisTarihi() {
		return cikisTarihi;
	}
	public void setCikisTarihi(String cikisTarihi) {
		this.cikisTarihi = cikisTarihi;
	}
	public int getR_KisiSayisi() {
		return r_KisiSayisi;
	}
	public void setR_KisiSayisi(int r_KisiSayisi) {
		this.r_KisiSayisi = r_KisiSayisi;
	}
	public int getGeceSayisi() {
		return geceSayisi;
	}
	public void setGeceSayisi(int geceSayisi) {
		this.geceSayisi = geceSayisi;
	}
	public int getToplamUcret() {
		return toplamUcret;
	}
	public void setToplamUcret(int toplamUcret) {
		this.toplamUcret = toplamUcret;
	}

}
