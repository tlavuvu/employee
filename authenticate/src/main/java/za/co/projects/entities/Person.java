package za.co.projects.entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	
	private String name;
	private String surname;
	private String idnumber;

	public Person(String name, String surname, String idnumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	
	

}
