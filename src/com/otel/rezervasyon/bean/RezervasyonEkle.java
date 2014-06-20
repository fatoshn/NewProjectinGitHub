/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.otel.rezervasyon.bean;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.otel.rezervasyon.entity.Personel;
import com.otel.rezervasyon.entity.Rezervasyon;
import com.otel.rezervasyon.util.EntityUtil;

import java.util.List;

@ManagedBean(name = "RezervasyonEkle")
@ViewScoped
public class RezervasyonEkle {
	EntityManager em = EntityUtil.getEntityManager();

	private Rezervasyon rezervasyon = new Rezervasyon();
	private List<Rezervasyon> rezervasyonList = new ArrayList<Rezervasyon>();

	public void clean(){
		rezervasyon = new Rezervasyon();
	}
	
	
	public void Ekle() {
		em.getTransaction().begin();
		em.persist(rezervasyon);
		em.getTransaction().commit();
	}

	public void listele() {
		em.getTransaction().begin();
		rezervasyonList = em.createQuery("from Rezervasyon").getResultList();
		em.getTransaction().commit();

	}

	public void guncelle(Rezervasyon a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();

	}

	public void sil(Rezervasyon a) {
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();

	}

	
	public Rezervasyon getRezervasyon() {
		return rezervasyon;
	}

	public void setRezervasyon(Rezervasyon rezervasyon) {
		this.rezervasyon = rezervasyon;
	}

	public List<Rezervasyon> getRezervasyonList() {
		return em.createQuery("from Rezervasyon").getResultList();	}

	public void setRezervasyonList(List<Rezervasyon> rezervasyonList) {
		this.rezervasyonList = rezervasyonList;
	}

}
