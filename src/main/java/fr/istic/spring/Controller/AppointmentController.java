package fr.istic.spring.Controller;

import fr.istic.spring.DTO.AppointmentDTO;
import fr.istic.spring.Dao.AppointementDao;
import fr.istic.spring.Dao.StudentDao;
import fr.istic.spring.Dao.TeacherDao;
import fr.istic.spring.Domain.Appointment;
import fr.istic.spring.Domain.Student;
import fr.istic.spring.Domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
    @RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private TeacherDao teacherDao;

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private AppointementDao AppDao;

    /**
     * POST /create  --> Create a new appointment and save it in the database.
     */
    @PostMapping(value = "/create")
    @ResponseBody
    public String createApp(@RequestBody AppointmentDTO dto ) {
        try {
            Teacher t = teacherDao.getReferenceById(dto.getId_teacher());
            Student s =  studentDao.getReferenceById(dto.getId_student());
            if (t != null && s != null) {
                System.out.println("test " + t.getId() +" " + dto.getId_teacher() + "\n" + s.getId() + " " + dto.getId_student());
                Appointment appointment = new Appointment();
                appointment.setTeacher(t);
                appointment.setStudent(s);
                appointment.setPlace(dto.getPlace());
                appointment.setStart(dto.getStart());
                appointment.setEnd(dto.getEnd());
                appointment.setTitle(dto.getTitle());

                AppDao.save(appointment);
            }
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "Appointment succesfully created" ;
    }



}
