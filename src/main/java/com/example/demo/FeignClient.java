package com.example.demo;

import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "client", url = "http://10.51.10.111:2000")
public interface FeignClient {

    //Register Student
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student registerStudent(@RequestBody Student student);

    //Get registered student
    @RequestMapping(method = RequestMethod.GET, value = "students")
    Student findByName(@RequestParam(name = "studentNumber") String studentNumber);

    //Get lecturers
   // @RequestMapping(method = RequestMethod.GET, value = "lecturers")
   // List<Lecturer> getAll();

    //Create Appointment
    //@RequestMapping(method = RequestMethod.POST, value = "appointments")
    //Appointment book(@RequestBody Appointment appointment);

    //Confirm Booking
    //@RequestMapping(method = RequestMethod.PATCH, value = "appointments/{appointmentId}")
    //Appointment confirm(@RequestParam(name = "studentId") Long studentId, @PathVariable(name = "appointmentId") Long appointmentId);
}
