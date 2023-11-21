package Domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher extends User {

	private Long id;

	private int TimeAppoint;
	private List<Appointement> appoints;
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
	public List<Appointement> getAppoints() {
		return appoints;
	}

	public void setAppoints(List<Appointement> appoints) {
		this.appoints = appoints;
	}

	public Teacher() {

	}
}
