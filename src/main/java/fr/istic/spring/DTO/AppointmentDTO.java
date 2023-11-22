package fr.istic.spring.DTO;

import java.sql.Time;

public class AppointmentDTO {


    long id_student;

    long id_teacher;

    private Time start;

    private Time end;

    private String place;

    private String title;

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public long getId_student() {
        return id_student;
    }

    public void setId_student(long id_student) {
        this.id_student = id_student;
    }

    public long getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(long id_teacher) {
        this.id_teacher = id_teacher;
    }
}
