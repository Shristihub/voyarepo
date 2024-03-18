/**
 * 
 */
package com.shristi.training;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

/**
 * @author shristi
 *
 */
public class CSVReadLine {
	public static void main(String[] args) {
		String filename="D:\\2021\\apps\\eclipseexamples\\javapgms\\emp.csv";
		try(CSVReader reader =  new CSVReader(new FileReader(filename));){
			String[] line;
			while((line = reader.readNext())!=null)
			for(String str:line) {
				System.out.println(str);
			}
		} catch (CsvValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
