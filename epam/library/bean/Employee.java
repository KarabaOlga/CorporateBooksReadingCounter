package com.epam.library.bean;
import java.util.Date;

public class Employee {
	//-        Employee (name, e-mail, date of birth)
	
	private String name;
	private String email;
	private Date dateBirth;
	
	public Employee(String name, String email, Date dateBirth ){
		this.name=name;
		this.email=email;
		this.dateBirth=dateBirth;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public Date getDateBirth(){
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth){
		this.dateBirth=dateBirth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((dateBirth == null) ? 0 : dateBirth.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
	    Employee other = (Employee) obj;
		if (name == null) {
			if (other.name!= null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (email == null) {
			if (other.email!= null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (dateBirth!= other.dateBirth)
			return false;
		return true;
	}
	public String toString(){
		 return "name: " + name + "e-mail: " + email + "date of birth: " + dateBirth;
	 }


}
