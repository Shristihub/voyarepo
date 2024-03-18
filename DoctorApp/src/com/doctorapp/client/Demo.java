/**
 * 
 */
package com.doctorapp.client;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * @author shristi
 *
 */
public class Demo {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor("Vijay", "Ortho", 3000, 12);
		IDoctorService doctorService = new DoctorServiceImpl();
		doctorService.addDoctor(doctor);
		
		doctorService.getAllDoctors().forEach(System.out::println);
		doctorService.getBySpeciality("Ortho").forEach(System.out::println);
		
		Doctor doc = doctorService.getById(1);
		System.out.println(doc);
		
		

	}

}
