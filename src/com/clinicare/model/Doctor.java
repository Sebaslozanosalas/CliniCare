package com.clinicare.model;

import com.clinicare.service.DoctorService;

public class Doctor {

    private static int counterID = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;

    public DoctorService(int id, String firstName, String lastName, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }

    public static int getCounterID() {
        return counterID;
    }

    public static void setCounterID(int counterID) {
        DoctorService.counterID = counterID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return id + " - " + firstName + " - " + lastName + " - "  + specialty;
    }
}
