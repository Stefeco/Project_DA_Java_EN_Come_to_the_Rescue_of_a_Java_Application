package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymptomsManager implements ISymptomsManager {
	/**
	 * Date : february 2 2021
	 * @author ecste
	 * @param symptomList is the arrayList built by the ReadSymptomDataFromFile method.
	 */
	public SymptomsManager(ArrayList<String> symptomList) {
		
	}

	/**
	 * Function that reads the arrayList with the symptoms and adds the occurrences in the values of the HashMap
	 * 
	 * @param importedList is the arrayList built by the ReadSymptomDataFromFile method
	 * @return SymptomCount as a HashMap with the names of the symptoms as indexes and the amount of the symptoms as values.
	 */
	@Override
	public Map<String, Integer> ComputeResults(ArrayList<String> importedList) {
		
		List<String> symptomList = new ArrayList<>(importedList);
		
		Map<String, Integer> SymptomCount = new HashMap<String, Integer>();
		
		for(String symptoms : symptomList) {
			
			String key = symptoms.toLowerCase();
			
			if(SymptomCount.containsKey(key)) {
					SymptomCount.put(key, SymptomCount.get(key)+1);
				}
			else {
				SymptomCount.put(key, 1);
				}
			}
		
		System.out.println(SymptomCount.toString());
		return(SymptomCount);
		
		}



}


