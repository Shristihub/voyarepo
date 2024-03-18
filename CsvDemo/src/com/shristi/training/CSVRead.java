/**
 * 
 */
package com.shristi.training;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * @author shristi
 *
 */
public class CSVRead {

	/**
	 * @param args  
	 */
	public static void main(String[] args) {
		String filename="D:\\2021\\apps\\eclipseexamples\\javapgms\\emp.csv";
		try(CSVReader reader =  new CSVReader(new FileReader(filename));){
			List<String[]> strList = reader.readAll();
			for(String[] strarr:strList) {
				for (String str : strarr) {
					System.out.println(str);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
