package com.ashiq.leetcode;

public class CommonPrefix_14{
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";

        String prefix = strs[0];

        for (int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;
    }
}

/*TEST CASE
* String strs[] = {"flower", "flow", "flight"};
* String strs[] = {"abc", "a", "ad"};
* String strs[] = {"c", "acc", "ccc"};
* String strs[] = {"parrot", "pivot", "parent"};
*
*
* */