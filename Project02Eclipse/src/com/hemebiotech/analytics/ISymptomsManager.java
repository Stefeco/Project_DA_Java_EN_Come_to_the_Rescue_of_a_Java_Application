package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;

public interface ISymptomsManager {
	
	/**
	 * Reads the array provided by ISympomReader and put the data in a new HashMap where the index is the symptom name and the value
	 * is the number of occurrences of these symptoms in the list
	 */
	
	/**
	 * Function that reads the arrayList with the symptoms and adds the occurrences in the values of the HashMap
	 * 
	 * @param importedList is the arrayList built by the ReadSymptomDataFromFile method
	 * @return SymptomCount as a HashMap with the names of the symptoms as indexes and the amount of the symptoms as values.
	 */
	Map<String, Integer> ComputeResults(ArrayList<String> importedList);

}
