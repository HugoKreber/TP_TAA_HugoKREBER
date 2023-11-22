package fr.istic.spring.Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student extends User{




	private List<Appointment> appoints;
	public Student() {

	}
	@OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST)
	public List<Appointment> getAppoints() {
		return appoints;
	}

	public void setAppoints(List<Appointment> appoints) {
		this.appoints = appoints;
	}

}
