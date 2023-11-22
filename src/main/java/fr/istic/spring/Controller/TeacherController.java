package fr.istic.spring.Controller;

import fr.istic.spring.DTO.StudentDTO;
import fr.istic.spring.DTO.TeacherDTO;
import fr.istic.spring.Dao.TeacherDao;
import fr.istic.spring.Dao.UserDao;
import fr.istic.spring.Domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TeacherDao teacherDao;

    /**
     * POST /create  --> Create a new user and save it in the database.
     */
    @PostMapping("/create")
    @ResponseBody
    public String createTeacher(@RequestBody TeacherDTO dto) {
        try {
            Teacher teacher = new Teacher();
            teacher.setName(dto.getName());
            teacher.setPassword(dto.getPassword());
            teacherDao.save(teacher);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "Teacher succesfully created" ;
    }

    /**
     * DELETE /delete  --> Delete the user having the passed id.
     */
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable("id") long id) {
        try {
            userDao.deleteById(id);
        }
        catch (Exception ex) {
            return "Error deleting the user:" + ex.toString();
        }
        return "Teacher succesfully deleted!";
    }



    /**
     * PUT /update  --> Update the email and the name for the user in the
     * database having the passed id.
     */
    @PutMapping("/update/{id}")
    @ResponseBody
    public String updateUser(@RequestBody TeacherDTO dto,@PathVariable("id") long id) {
        try {
            Teacher teacher = teacherDao.findById(id).get();
            teacher.setPassword(dto.getName());
            teacher.setName(dto.getPassword());
            teacherDao.save(teacher);
        }
        catch (Exception ex) {
            return "Error updating the user: " + ex.toString();
        }
        return "User succesfully updated!";
    }






}
