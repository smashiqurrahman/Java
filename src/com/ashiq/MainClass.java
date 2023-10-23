package com.ashiq;

import com.ashiq.leetcode.*;


public class MainClass {

	public static void main(String[] args) {

		 String strs0[] = {"abc", "a", "ad"};
		 String strs1[] = {"c", "acc", "ccc"};
		 String strs2[] = {"parrot", "pivot", "parent"};		
		 String strs3[] = {"flower", "flow", "flight"};
		
		CommonPrefix_14 cp = new CommonPrefix_14();
		System.out.println(cp.longestCommonPrefix(strs0));
		
	}

}
