package com.marlabs.hbm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "PERSON0101")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {

	@Id
	@GeneratedValue
	@Column(name = "PERSON_ID")
	private Long personId;
	
	@Column(name = "FIRSTNAME", length = 30)
	private String firstname;
	
	@Column(name = "LASTNAME", length = 30)
	private String lastname;
	
	public Person() {
	
	}
	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
