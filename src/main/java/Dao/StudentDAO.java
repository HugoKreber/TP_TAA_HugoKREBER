package Dao;

import Domain.Student;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentDAO extends AbstractJpaDao {
    private EntityManager manager;

    public StudentDAO() {
        this.setClazz(Student.class);
    }




}
