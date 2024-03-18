package com.doctorapp.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.model.Doctor;

public interface IDoctorDao {

	void addDoctor(Doctor doctor);
//	 void addDoctorsFromFile(String filename);
	int updateDoctor(int doctorId, double fees);
	
	Doctor findById(int doctorId);
	void deleteDoctor(int doctorId);
	
	List<Doctor> findAllDoctors();
	List<Doctor> findBySpeciality(String speciality);
	List<Doctor> findBySpecialityAndExp(String speciality, int experience);
	List<Doctor> findBySpecialityAndfees(String speciality,double fees);

//	List<Doctor> findByAvailability(LocalDateTime startTime);
	
}
