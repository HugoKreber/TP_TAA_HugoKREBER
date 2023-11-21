package Domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student extends User{



	public Student() {

	}
	private List<Appointement> appoints;

	@OneToMany(mappedBy = "student", cascade = CascadeType.PERSIST)
	public List<Appointement> getAppoints() {
		return appoints;
	}

	public void setAppoints(List<Appointement> appoints) {
		this.appoints = appoints;
	}

}
