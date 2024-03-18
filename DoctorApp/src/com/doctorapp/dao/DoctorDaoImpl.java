package com.doctorapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;
import com.opencsv.bean.CsvToBeanBuilder;

public class DoctorDaoImpl implements IDoctorDao {

	@Override
	public void addDoctor(Doctor doctor) {
		try(Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement = connection.prepareStatement(Queries.INSERTQUERY);){
			statement.setString(1, doctor.getDoctorName());
			statement.setInt(3, doctor.getExperience());
			statement.setDouble(4, doctor.getFees());
			statement.setString(2, doctor.getSpeciality());
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		int result = 0;
		try {
			connection = DbConnection.openConnection();
			preparedstatement = connection.prepareStatement(Queries.UPDATEQUERY);
			preparedstatement.setDouble(1, fees);
			preparedstatement.setInt(2, doctorId);
			result = preparedstatement.executeUpdate();
			System.out.println(result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbConnection.closeConnection();
			try {
				if (preparedstatement != null)
					preparedstatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;

	}

	@Override
	public Doctor findById(int doctorId) {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement = null;
		Doctor doctor  = new Doctor();
		ResultSet rs = null;
		try {
			statement = connection.prepareStatement("select * from doctor where doctorId=?");
			statement.setInt(1, doctorId);
			rs = statement.executeQuery();
			while (rs.next()) {
				int doId = rs.getInt("doctorId");
				String doctorname = rs.getString("doctorname");
				int experience = rs.getInt("experience");
				double fees = rs.getDouble("fees");
				String speciality = rs.getString("speciality");
				doctor.setDoctorName(doctorname);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Doctor> findAllDoctors() {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement = null;
		List<Doctor> doctorList = new ArrayList<>();
		ResultSet rs = null;
		try {
			statement = connection.prepareStatement("select * from doctor");
			rs = statement.executeQuery();
			while (rs.next()) {
				int doctorId = rs.getInt("doctorId");
				String doctorname = rs.getString("doctorname");
				int experience = rs.getInt("experience");
				double fees = rs.getDouble("fees");
				String speciality = rs.getString("speciality");
				Doctor doctor = new Doctor(doctorname, speciality, fees, experience);
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return doctorList;

	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement = null;
		List<Doctor> doctorList = new ArrayList<>();
		ResultSet rs = null;
		try {
			statement = connection.prepareStatement("select * from doctor where speciality=?");
			statement.setString(1, speciality);
			rs = statement.executeQuery();
			while (rs.next()) {
				int doctorId = rs.getInt("doctorId");
				String doctorname = rs.getString("doctorname");
				int experience = rs.getInt("experience");
				double fees = rs.getDouble("fees");
				String nspeciality = rs.getString("speciality");
				Doctor doctor = new Doctor(doctorname, speciality, fees, experience);
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return doctorList;
	}

	@Override
	public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findBySpecialityAndfees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> findByAvailability(LocalDateTime startTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDoctorsFromFile(String filename) {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement = null;
		try {
			List<Doctor> doctors = new CsvToBeanBuilder<Doctor>
			    (new FileReader(filename)).withType(Doctor.class).build()
					.parse();
			statement = connection.prepareStatement(Queries.INSERTQUERY);
			for (Doctor doctor : doctors) {
				statement.setString(1, doctor.getDoctorName());
				statement.setInt(3, doctor.getExperience());
				statement.setDouble(4, doctor.getFees());
				statement.setString(2, doctor.getSpeciality());
				statement.execute();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
				DbConnection.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
