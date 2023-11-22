package fr.istic.spring.Domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher extends User {

	private int TimeAppoint;
	private List<Appointment> appoints;
	List<String> titles;

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}



	public int getTimeAppoint() {
		return TimeAppoint;
	}

	public void setTimeAppoint(int timeAppoint) {
		TimeAppoint = timeAppoint;
	}


	@OneToMany(mappedBy = "teacher", cascade = CascadeType.PERSIST)
	public List<Appointment> getAppoints() {
		return appoints;
	}

	public void setAppoints(List<Appointment> appoints) {
		this.appoints = appoints;
	}

	public Teacher() {

	}
	public Teacher(String name) {

	}
}
