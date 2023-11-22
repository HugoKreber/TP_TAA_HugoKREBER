package fr.istic.spring.Controller;

import fr.istic.spring.Dao.TeacherDao;
import fr.istic.spring.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    private UserDao userDao;

}
