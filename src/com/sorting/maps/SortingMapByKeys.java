package com.sorting.maps;

import java.util.HashMap;
import java.util.Map;

import com.understanding.collections.College;
import com.understanding.collections.Students;

public class SortingMapByKeys {

	public void sortingMaps() {
		College c = new College(1, "name", "address");
		College c1 = new College(5, "mname", "address");
		College c2 = new College(3, "niame", "address");
		College c3 = new College(2, "namer", "address");
		College c4 = new College(4, "oname", "address");

		Students s = new Students(3, "enam");
		Students s1 = new Students(1, "tnam");
		Students s2 = new Students(2, "fnam");
		Students s3 = new Students(5, "gnam");
		Students s4 = new Students(5, "lnam");

		Map<College, Students> sortingValuesMap = new HashMap<College, Students>();
		sortingValuesMap.put(c, s);
		sortingValuesMap.put(c1, s1);
		sortingValuesMap.put(c2, s2);
		sortingValuesMap.put(c3, s3);
		sortingValuesMap.put(c4, s4);

		sortingMapValues(sortingValuesMap);
	}
	public Map<College,Students> sortingMapValues(Map<College, Students> sortingValuesMap){
		
	//	List<>
		
		for(Map.Entry<College, Students> mySorting:sortingValuesMap.entrySet()) {
			
		}
			
			
			
		return sortingValuesMap;
		
	}

}
