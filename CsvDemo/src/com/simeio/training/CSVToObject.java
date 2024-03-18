/**
 * 
 */
package com.simeio.training;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author shristi
 *
 */
public class CSVToObject {
	public static void main(String[] args) {
		String filename="D:\\2021\\apps\\eclipseexamples\\javapgms\\employee.csv";
		try {
			List<Employee> employees = new CsvToBeanBuilder<Employee>(new FileReader(filename))
					.withType(Employee.class)
					.build()
					.parse();
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
