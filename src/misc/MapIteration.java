package misc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {
	public void mapIterationAllType() {
		Map<Integer, String> coursesMap = new HashMap<Integer, String>();
		coursesMap.put(1, "C");
		coursesMap.put(2, "C++");
		coursesMap.put(3, "Java");
		coursesMap.put(4, "JavaScript");
		coursesMap.put(5, "Python");
		coursesMap.put(6, "C#");
		
		// Using iterator
		System.out.println("Using iterator");
		Iterator<Map.Entry <Integer, String>> iterator = coursesMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> course = iterator.next();
			coursePrint(course.getKey(), course.getValue());
		}
		

		// Enhanced loop
		System.out.println("Enhanced loop");
		for(Map.Entry<Integer, String> beer : coursesMap.entrySet()) {
			coursePrint(beer.getKey(), beer.getValue());
		}
		
		// JDK 8 forEach with lambda
		System.out.println("JDK 8 forEach with lambda");
		coursesMap.forEach((k, v) -> coursePrint(k, v));
		
		// JDK 8 for each method reference -- works in static class. Here MapIteration is the class name
		//coursesMap.forEach(MapIteration :: coursePrint);
		
	}
	

	private void coursePrint(Integer key, String value) {
		System.out.println("Course no : " + key + " and course name : " + value);
		
	}
}
