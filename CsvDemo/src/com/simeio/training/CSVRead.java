package com.simeio.training;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVRead {

	public static void main(String[] args) {
		String filename = "D:\\2021\\apps\\eclipseexamples\\javapgms\\employee.csv";
		try (FileReader fileReader = new FileReader(filename);
				// Create an object of CsvReader
				CSVReader csvReader = new CSVReader(fileReader);) {
			List<String[]> empList = csvReader.readAll();
			for (String[] employeeArr: empList) {
				for (String empstr : employeeArr) {
					System.out.print(empstr+" \t");
				}
				System.out.println();
			}
		}catch(Exception e) {
				e.printStackTrace();
			
		}

	}

}
