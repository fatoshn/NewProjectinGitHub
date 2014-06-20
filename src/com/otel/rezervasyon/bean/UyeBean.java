/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.otel.rezervasyon.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.servlet.*;

import com.otel.rezervasyon.entity.Rezervasyon;
import com.otel.rezervasyon.util.EntityUtil;

@ManagedBean (name="Uyelik")
@RequestScoped
public class UyeBean {
    
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
	
	
}
