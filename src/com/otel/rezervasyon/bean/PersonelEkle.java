/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.otel.rezervasyon.bean;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.otel.rezervasyon.entity.Oda;
import com.otel.rezervasyon.entity.Personel;
import com.otel.rezervasyon.util.EntityUtil;


@ManagedBean
@ViewScoped
public class PersonelEkle {
    

	EntityManager em = EntityUtil.getEntityManager();
	private Personel personel = new Personel();
	private List<Personel> personelList = new ArrayList<Personel>();

	public void clean(){
		personel = new Personel();
	}
	
	public void Ekle() {
		em.getTransaction().begin();
		em.persist(personel);
		em.getTransaction().commit();
	}

	public void listele() {
		em.getTransaction().begin();
		personelList = em.createQuery("from Personel").getResultList();
		em.getTransaction().commit();

	}

	public void guncelle(Personel a) {
		em.getTransaction().begin();
		em.merge(a);
		em.getTransaction().commit();

	}

	public void sil(Personel a) {
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

	public Personel getPersonel() {
		return personel;
	}

	public void setPersonel(Personel personel) {
		this.personel = personel;
	}

	public List<Personel> getPersonelList() {
		return  em.createQuery("from Personel").getResultList();
	}

	public void setPersonelList(List<Personel> personelList) {
		this.personelList = personelList;
	}
	
	
}
