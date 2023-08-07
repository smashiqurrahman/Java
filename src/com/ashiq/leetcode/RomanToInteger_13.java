package com.ashiq.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
	 public int romanToInt(String s) {

		    int result = 0;

		    Map<Character, Integer> romanNumMap = new HashMap<Character, Integer>();
		    romanNumMap.put('I', 1);
		    romanNumMap.put('V', 5);
		    romanNumMap.put('X', 10);
		    romanNumMap.put('L', 50);
		    romanNumMap.put('C', 100);
		    romanNumMap.put('D', 500);
		    romanNumMap.put('M', 1000);

		    for (int i = 0; i < s.length() - 1; i++) {
		      if (romanNumMap.get(s.charAt(i)) < romanNumMap.get(s.charAt(i + 1)))
		        result -= romanNumMap.get(s.charAt(i));
		      else
		        result += romanNumMap.get(s.charAt(i));

		    }
		    
		    result += romanNumMap.get(s.charAt(s.length()-1));

		    return result;
		  }
}
