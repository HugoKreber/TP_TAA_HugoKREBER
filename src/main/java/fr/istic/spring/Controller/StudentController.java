package fr.istic.spring.Controller;

import fr.istic.spring.DTO.AppointmentDTO;
import fr.istic.spring.DTO.StudentDTO;
import fr.istic.spring.Dao.StudentDao;
import fr.istic.spring.Dao.UserDao;
import fr.istic.spring.Domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private UserDao userDao;

    @Autowired
    private StudentDao studentDao;
    /**
     * GET /create  --> Create a new user and save it in the database.
     */
    @PostMapping("/create")
    @ResponseBody
    public String createTeacher(@RequestBody StudentDTO dto) {
        try {
            Student student = new Student();
            student.setName(dto.getName());
            student.setPassword(dto.getPassword());
            studentDao.save(student);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "Student succesfully created" ;
    }
}
