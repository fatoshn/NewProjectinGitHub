/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.otel.rezervasyon.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.otel.rezervasyon.entity.Musteri;
import com.otel.rezervasyon.entity.Oda;
import com.otel.rezervasyon.util.EntityUtil;

@ManagedBean
@ViewScoped
public class OdaBean {
	EntityManager em = EntityUtil.getEntityManager();
	private Oda oda = new Oda();
	private List<Oda> OdaList = new ArrayList<Oda>();
	private List<Oda> doluOdalar = em.createQuery("from Oda where odaDurumu = 1").getResultList();
	private List<Oda> bosOdalar = em.createQuery("from Oda where odaDurumu = 0").getResultList();
	public void clean(){
		oda = new Oda();
	}
	
	
	public void Ekle() {
		em.getTransaction().begin();
		em.persist(oda);
		em.getTransaction().commit();
	}
@PostConstruct
	public void listele() {
		em.getTransaction().begin();
		OdaList = em.createQuery("from Oda").getResultList();
		em.getTransaction().commit();

	}

	public void guncelle() {
		em.getTransaction().begin();
		em.merge(oda);
		em.getTransaction().commit();

	}

	public void sil(Oda a) {
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();

	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Oda getOda() {
		return oda;
	}

	public void setOda(Oda oda) {
		this.oda = oda;
	}

	public List<Oda> getOdaList() {
		return em.createQuery("from Oda").getResultList();
	}

	public void setOdaList(List<Oda> odaList) {
		OdaList = odaList;
	}

	public List<Oda> getDoluOdalar() {
		return em.createQuery("from Oda where odaDurumu = 1").getResultList();
	}

	public void setDoluOdalar(List<Oda> doluOdalar) {
		this.doluOdalar = doluOdalar;
	}

	public List<Oda> getBosOdalar() {
		return em.createQuery("from Oda where odaDurumu = 0").getResultList();
	}

	public void setBosOdalar(List<Oda> bosOdalar) {
		this.bosOdalar = bosOdalar;
	}
	
	
}
