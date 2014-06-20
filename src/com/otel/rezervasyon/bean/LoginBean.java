package com.otel.rezervasyon.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.FacesContextFactory;
import javax.faces.view.facelets.FaceletContext;
import javax.persistence.EntityManager;

import com.otel.rezervasyon.entity.userinfo;
import com.otel.rezervasyon.util.EntityUtil;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {
	private userinfo user = new userinfo();
	private String username;
	private String password;
	private String message;
	EntityManager em = EntityUtil.getEntityManager();

	public String login() throws IOException {
		message = "";
		List<userinfo> userList = em.createQuery(
				"from userinfo where username ='" + username + "' and password ='"
						+ password +"'").getResultList();
		
		
			this.user = userList.get(0);
			// TODO FATMA homepage ye yonlendir.
			  FacesContext.getCurrentInstance().getExternalContext()
	            .redirect("/OtelOtomasyon/index.jsf");
			  return "true";
		} else {
			setMessage("Þifre/Kullanýcý adý yanlýþ. Tekrar deneyiniz.");
			return "false";
		}
	}
	
	public void clean(){
		this.username="";
		this.password="";
		
	}

	// Örnek Kullanýmlar
//		public void SaveUser(User user){
//			Veri kaydetme
//			em.getTransaction().begin();// baðlantýyý baþlatýr
//			em.persist(user); // veriler eklenir
//			em.getTransaction().commit(); // Eklenen deðiþikler database e uygulanýr.
//			//Burda Transaction mantýðý var. 
//			
//			
//			// Veri çekme  (em.getTransaction().begin(); gerekmez )
//			this.userList = em.createQuery("from UserInfo").getResultList();
//			userInfo=em.find(UserInfo.class,id); // tek kayýt
//			// veri güncelleme  (em.getTransaction().begin(); gerekmez )
//			em.merge(userInfo);
//			//veri silme 
//			em.getTransaction().begin();
//			em.remove(UserInfo);
//			em.getTransaction().commit();
//			
	
	
	public userinfo getUser() {
		return user;
	}

	public void setUser(userinfo user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
