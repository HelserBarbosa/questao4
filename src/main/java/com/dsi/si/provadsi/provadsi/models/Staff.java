package com.dsi.si.provadsi.provadsi.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idStaff;
	
	private String forename;
	
	private String suname;
	
	@ManyToOne
	@JoinColumn(name = "id_type")
	private StaffType type;
	
	@OneToMany
	@JoinColumn(name = "id_staff")
	private List<Care> cares;
	
	public Long getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(Long idStaff) {
		this.idStaff = idStaff;
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

	public StaffType getType() {
		return type;
	}

	public void setType(StaffType type) {
		this.type = type;
	}

	public List<Care> getCares() {
		return cares;
	}

	public void setCares(List<Care> cares) {
		this.cares = cares;
	}
	
	
}
