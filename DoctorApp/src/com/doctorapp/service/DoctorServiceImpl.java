package com.doctorapp.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.model.Doctor;


/**
 * @author shristi
 *
 */
public class DoctorServiceImpl implements IDoctorService{ 
	
	IDoctorDao doctorDao = new DoctorDaoImpl();
	
	@Override
	public void addDoctor(Doctor doctor) {
		//call the method of DoctorDao
		doctorDao.addDoctor(doctor);
	}

	public int updateDoctor(int doctorId, double fees) {
		int result =  doctorDao.updateDoctor(doctorId, fees);
		
		return result;
	}

	/**
	 * @param doctorId
	 * @return  Doctor
	 */
	@Override
	public Doctor getById(int doctorId) {
		Doctor doctor = doctorDao.findById(doctorId);
		if(doctor==null)
			return null;
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorDao.deleteDoctor(doctorId);
		
	}

	/**
	 * @return  
	 */
	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor>  doctorList = doctorDao.findAllDoctors();
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		List<Doctor>  doctors = doctorDao.findBySpeciality(speciality);
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("doctor with spec not found");
		
		return doctors.stream()
				   .sorted((d1,d2)->d1.getDoctorName().compareTo(d2::getDoctorName))
				    .collect(Collectors.toList())
		
		
		
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) {
		List<Doctor>  doctors = doctorDao.findBySpecialityAndExp(speciality, experience);
		if(doctors.isEmpty())
			throw new DoctorNotFoundException("doctor with spec not found");
		
		return doctors.stream()
				   .sorted((d1,d2)->d1.getDoctorName().compareTo(d2::getDoctorName))
				    .collect(Collectors.toList())
	}

	@Override
	public List<Doctor> getBySpecialityAndfees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDoctorsFromFile(String filename) {
		doctorDao.addDoctorsFromFile(filename);
		
	}

//	@Override
//	public List<Doctor> getByAvailability(LocalDateTime startTime) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	

}
