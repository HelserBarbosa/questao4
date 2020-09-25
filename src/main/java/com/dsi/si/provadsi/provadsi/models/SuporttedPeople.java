package com.dsi.si.provadsi.provadsi.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SuporttedPeople {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idSuporttedPeople;
	
	private String forename;
	
	private String suname;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	@Lob
	private String photo;

	public Long getIdSuporttedPeople() {
		return idSuporttedPeople;
	}

	public void setIdSuporttedPeople(Long idSuporttedPeople) {
		this.idSuporttedPeople = idSuporttedPeople;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
}
