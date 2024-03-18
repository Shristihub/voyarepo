package com.doctorapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.doctorapp.dao.IDoctorDao;
import com.doctorapp.dao.DoctorDaoImpl;
import com.doctorapp.model.Doctor;


/**
 * @author shristi
 *
 */
public class DoctorServiceImpl implements IDoctorService{ 
	IDoctorDao doctorDao = new DoctorDaoImpl();
	
	
	/**
	 * @param doctor  
	 */
	@Override
	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
	}

	/**
	 * @param doctorId
	 * @param fees
	 * @return  
	 */
	public int updateDoctor(int doctorId, double fees) {
		int result =  doctorDao.updateDoctor(doctorId, fees);
		if(result==0)
			throw new ArithmeticException();
		return result;
	}

	/**
	 * @param doctorId
	 * @return  Doctor
	 */
	@Override
	public Doctor getById(int doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndfees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Doctor> getByAvailability(LocalDateTime startTime) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	

}
