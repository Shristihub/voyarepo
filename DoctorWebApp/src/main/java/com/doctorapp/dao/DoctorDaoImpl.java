package com.doctorapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DbConnection;
import com.doctorapp.util.Queries;

public class DoctorDaoImpl implements IDoctorDao{

	@Override
	public void addDoctor(Doctor doctor) {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement =null;
		try {
			statement = connection.prepareStatement(Queries.INSERTQUERY);
			statement.setString(1, doctor.getDoctorName());
			statement.setInt(3, doctor.getExperience());
			statement.setDouble(4, doctor.getFees());
			statement.setString(2, doctor.getSpeciality());
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(statement!=null)
					statement.close();
				DbConnection.closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
		public int updateDoctor(int doctorId, double fees) {
			Connection connection = null;
			PreparedStatement preparedstatement = null;
			int  result = 0;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Doctor> findAllDoctors() {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement =null;
		List<Doctor> doctorList = new ArrayList<>();
		ResultSet rs = null;
		try {
			statement = connection.prepareStatement("select * from doctor");
			rs = statement.executeQuery();
			while(rs.next()) {
				int doctorId = rs.getInt("doctorId");
				String doctorname = rs.getString("doctorname");
				int experience = rs.getInt("experience");
				double fees = rs.getDouble("fees");
				String speciality = rs.getString("speciality");
				Doctor doctor = new Doctor(doctorname,doctorId,speciality,fees,experience);
				doctorList.add(doctor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return doctorList;
			
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		Connection connection = DbConnection.openConnection();// get the connection
		PreparedStatement statement =null;
		List<Doctor> doctorList = new ArrayList<>();
		ResultSet rs = null;
		try {
			statement = connection.prepareStatement("select * from doctor where speciality=?");
			statement.setString(1, speciality);
			rs = statement.executeQuery();
			while(rs.next()) {
				int doctorId = rs.getInt("doctorId");
				String doctorname = rs.getString("doctorname");
				int experience = rs.getInt("experience");
				double fees = rs.getDouble("fees");
				String nspeciality = rs.getString("speciality");
				Doctor doctor = new Doctor(doctorname,doctorId,speciality,fees,experience);
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

	

	

}
