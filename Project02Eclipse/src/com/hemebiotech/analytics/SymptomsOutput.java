package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

/**
 * Date : february 8 2021
 * @author ecste
 *
 */
public class SymptomsOutput implements ISymptomsOutput {
	
	/**
	 * The constructor for the SymptomsOutput class.
	 */
	Map<String, Integer> SymptomsOutput = new HashMap<String, Integer>(){
		private static final long serialVersionUID = 1L;
	};

	/**
	 * printSymptoms : Method that sorts alphabetically the result of the symptoms into a treemap and prints it
	 * then use the writer method to export the result in the result.out file.
	 * 
	 * @param symptoms is the HashMap created by the SymptomsManager class.
	 *
	 */
	public Map<String, Integer> printSymptoms(Map<String, Integer> symptoms) {

		/**
		 * Another constructor as a TreeMap to sort the list of symptoms in an alphabetical order.
		 */
		Map<String, Integer> Symptoms = new TreeMap<String, Integer>();
		
		FileWriter writer;
		/**
		 * The try catch returns an error if the file is missing or if the file is of the wrong type.
		 */
		try {
			writer = new FileWriter ("result.out");
			/**
			 * It is necessary to add a constructor and change the type of sortedSymptoms into a treemap.
			 * So we are able to sort the indexes alphabetically.
			 */
			Map<String, Integer> sortedSymptoms = new TreeMap<String, Integer>(symptoms);
			
			/**
			 * We run an iteration on sortedSymptoms to print them to an external file.
			 * 
			 */
			for(Map.Entry<String, Integer> entry:sortedSymptoms.entrySet()) {
				
				System.out.println("sorted values : " + entry.getKey() + " " + entry.getValue());
				writer.write("sorted values : " + entry.getKey() + " " + entry.getValue());
				writer.write("\r\n");
			}

			writer.close();
			
		} catch (IOException e) {
			System.out.println("There has been an error when creating the output file");
			e.printStackTrace();
		} 
		
		return Symptoms;
		
	}

}


