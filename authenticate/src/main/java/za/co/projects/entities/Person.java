package za.co.projects.entities;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;

@MappedSuperclass
public class Person {
	
	private String name;
	private String surname;
	private String idnumber;
	
	@OneToMany
	private Address address;

	public Person(String name, String surname, String idnumber, Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.idnumber = idnumber;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", idnumber=" + idnumber + ", address=" + address
				+ "]";
	}
	
	

}
