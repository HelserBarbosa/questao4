package com.dsi.si.provadsi.provadsi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Care {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCare;
	
	@ManyToOne
	@JoinColumn(name = "id_suportted_people")
	private SuporttedPeople people;

	public Long getIdCare() {
		return idCare;
	}

	public void setIdCare(Long idCare) {
		this.idCare = idCare;
	}

	public SuporttedPeople getPeople() {
		return people;
	}

	public void setPeople(SuporttedPeople people) {
		this.people = people;
	}
	
	
	
}
