package com.java.springbootpractice.appointment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AppointmentController {

    ArrayList appointmentList = new ArrayList<Appointment>();

    @GetMapping("/")
    public ArrayList<Appointment> index()
    {
        return appointmentList;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void AddAppointment(@RequestBody Appointment appointment){
        appointmentList.add(appointment);
    }



}