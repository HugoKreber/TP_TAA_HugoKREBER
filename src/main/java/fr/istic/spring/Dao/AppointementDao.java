package fr.istic.spring.Dao;


import fr.istic.spring.Domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointementDao extends JpaRepository<Appointment, Long>{


}
