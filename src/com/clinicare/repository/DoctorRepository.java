package com.clinicare.repository;

import com.clinicare.model.Doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DoctorRepository {
    private List<Doctor> doctors = new ArrayList<>();

    public List<Doctor> findAll() {
        return doctors;
    }

    public Optional<Doctor> findById(String id) {
        return doctors.stream().filter(doctor -> doctor.getId().equals(id)).findFirst();
    }

    public void save(Doctor doctor) {
        doctors.add(doctor);
    }

    public void delete(Doctor doctor) {
        doctors.remove(doctor);
    }
}