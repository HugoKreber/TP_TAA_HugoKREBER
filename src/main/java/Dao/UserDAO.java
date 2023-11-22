package Dao;

import Domain.Student;
import Domain.Teacher;
import Domain.User;
import jakarta.persistence.EntityManager;

public class UserDAO extends AbstractJpaDao {

    private EntityManager manager;

    public UserDAO () {
        this.setClazz(User.class);
    }




}
