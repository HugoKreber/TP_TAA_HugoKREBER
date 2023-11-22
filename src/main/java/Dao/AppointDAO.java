package Dao;

import Domain.Appointement;
import Domain.Student;
import jakarta.persistence.EntityManager;
import java.util.List;

public class AppointDAO extends AbstractJpaDao {
    private EntityManager manager;

    public AppointDAO() {
        this.setClazz(Appointement.class);
    }




}
