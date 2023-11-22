package Dao;

import Domain.Student;
import Domain.Teacher;
import jakarta.persistence.EntityManager;

public class TeacherDAO extends AbstractJpaDao {

    private EntityManager manager;

    public TeacherDAO () {
        this.setClazz(Teacher.class);
    }




}
