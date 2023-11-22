package fr.istic.spring.DTO;

import fr.istic.spring.Domain.Appointment;
import fr.istic.spring.Domain.Student;
import fr.istic.spring.Domain.Teacher;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper {



    MapStructMapper INSTANCE = Mappers.getMapper( MapStructMapper.class );

    TeacherDTO teacherDto(Teacher teacher);

    @Mappings({
            @Mapping(target = "id_student", source = "student.id"),
            @Mapping(target = "id_teacher", source = "teacher.id")
    })
    AppointmentDTO appointmentToDTO(Appointment appointment);

    @Mappings({
            @Mapping(target = "student.id", source = "id_student"),
            @Mapping(target = "teacher.id", source = "id_teacher")
    })
    Appointment dtoToAppointment(AppointmentDTO appointmentDTO);

    StudentDTO studentDto(Student student);

}
