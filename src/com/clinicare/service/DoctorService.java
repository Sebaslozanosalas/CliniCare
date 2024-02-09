package com.clinicare.service;

import com.clinicare.model.Doctor;
import com.clinicare.repository.DoctorRepository;

import java.util.List;

public class DoctorService {
    private final DoctorRepository repository = new DoctorRepository();

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }

    public void addDoctor(String id, String name, String specialty) {
        Doctor doctor = new Doctor(id, name, specialty);
        repository.save(doctor);
    }

    public void removeDoctor(String id) {
        repository.findById(id).ifPresent(repository::delete);
    }
}
