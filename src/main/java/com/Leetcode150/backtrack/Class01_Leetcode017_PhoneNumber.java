package com.Leetcode150.backtrack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author cmsxyz@163.com
 * @date 2024-05-25 11:11
 * @usage
 */
public class Class01_Leetcode017_PhoneNumber {
    static List<String> res=new ArrayList<>();

    public static void main(String[] args) {
        for (String s : letterCombinations("2")) {
            System.out.print(s+" ");
        }
    }
    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<Character, String>() {{
                put('2',"abc");
                put('3',"def");
                put('4',"ghi");
                put('5',"jkl");
                put('6',"mno");
                put('7',"pqrs");
                put('8',"tuv");
                put('9',"wxyz");
        }};
        backtarck(map,new StringBuilder(),digits,0);
        return res;
    }

    private static void backtarck(HashMap<Character, String> map, StringBuilder sb, String digits, int index) {
        if(index==digits.length()){
            res.add(sb.toString());
            return;
        }

        char c = digits.charAt(index);
        String line = map.get(c);
        for (int i = 0; i < line.length(); i++) {
            sb.append(line.charAt(i));
            backtarck(map,sb,digits,index+1);
            sb.deleteCharAt(index);
        }
    }
}
