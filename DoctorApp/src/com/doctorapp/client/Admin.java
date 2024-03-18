
package com.doctorapp.client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author shristi
 *
 */
public class Admin {

	
	public static void main(String[] args) {
		String filename="D:\\2021\\apps\\eclipseexamples\\jdbcdemos\\doctors.csv";
		IDoctorService doctorService  = new DoctorServiceImpl();
		doctorService.addDoctorsFromFile(filename);
	}

}
