package com.example.demo;

import com.example.demo.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignRun implements CommandLineRunner {

    private final FeignClient feignClient;

    public FeignRun(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @Override
    public void run(String... args) throws Exception {

        // Registering a student - ID = 5
        Student reg = feignClient.registerStudent(new Student("", ""));
        System.out.println("Created the following: " + reg);

        //Find Registered Student
        Student find = feignClient.findByName("");
        System.out.println("Found your request: " + find);



        // Get all lecs
       // List<Lecturer> all = feignClient.getAll();
        //System.out.println("All Lecs: " + all);

        //Book an appointment
//         Appointment schedule = feignClient.book(new Appointment(5L, 1L));
        //System.out.println("Appointment: " + schedule);

        //Confirm booking
//         Appointment confirmation = feignClient.confirm(5L, 6L);
        //System.out.println("Confirmed: " + confirmation);
    }
}
