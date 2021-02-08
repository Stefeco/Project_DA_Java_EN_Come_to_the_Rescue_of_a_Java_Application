package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

/**
 * Date february 7 2021
 * @author ecste
 * This is the main method :
 * 	- call ReadSymptomDataFromFile to read the txt file and list all the symptoms in an ArrayList
 * 	- call SymptomsManager to read the ArrayList and add all the symptoms in a HasMap. It increments every symptom with new occurences.
 * 	- call SymptomsOutput to sort the symptoms and their values into a treemap. Then use the FileWriter to print the sorted map on an external file.
 *
 */

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("symptoms.txt");
		ArrayList<String> result = (ArrayList<String>) readSymptoms.GetSymptoms();
		
		
		SymptomsManager symptomResult = new SymptomsManager(result);
		Map<String, Integer> symptomCount = symptomResult.ComputeResults(result);

		
		SymptomsOutput symptomsFile = new SymptomsOutput();
		symptomsFile.printSymptoms(symptomCount);

		}
	

		

}
