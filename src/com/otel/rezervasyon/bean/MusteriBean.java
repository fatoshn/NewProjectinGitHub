/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.otel.rezervasyon.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

import com.otel.rezervasyon.entity.Musteri;
import com.otel.rezervasyon.util.EntityUtil;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class MusteriBean {
  
	private Musteri musteri = new Musteri();
	private List< Musteri> musteriList = new ArrayList<Musteri>();
	EntityManager em = EntityUtil.getEntityManager();
	public void clean(){
		musteri = new Musteri();
	}
	
	
	public void Ekle(){
		em.getTransaction().begin();
		em.persist(musteri);
		em.getTransaction().commit();
	}
	
	public void listele(){
		em.getTransaction().begin();
		musteriList = em.createQuery("from Musteri").getResultList();
		em.getTransaction().commit();
		
	}
	
	public void sil(Musteri a){
		em.getTransaction().begin();
		em.remove(a);
		em.getTransaction().commit();
		
	}
	
	
	

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public List< Musteri> getMusteriList() {
		return em.createQuery("from Musteri").getResultList();
	}

	public void setMusteriList(List< Musteri> musteriList) {
		this.musteriList = musteriList;
	}
	
	
      
}
