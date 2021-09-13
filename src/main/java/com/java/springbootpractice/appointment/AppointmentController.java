package com.java.springbootpractice.appointment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

    @GetMapping("/")
    public Appointment index()
    {
        Appointment ap = new Appointment();
        ap.setTime("3:00");
        ap.setTitle("Test Appointment");
        return ap;
       // return "Greetings from Spring Boot!";
    }

}