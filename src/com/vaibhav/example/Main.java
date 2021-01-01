package com.vaibhav.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int romanToInt(String s){

        Map<Character, Integer> map1 = new HashMap<>();
        
        map1.put('I', 1);
        map1.put('V', 5);
        map1.put('X', 10);
        map1.put('L', 50);
        map1.put('C', 100);
        map1.put('D', 500);
        map1.put('M', 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            int temp = i +1 >= s.length() ? s.length()-1 : i+1;
            if(s.charAt(temp) == 'V' && s.charAt(i) == 'I'){
                sum -= 1;
            } else if(s.charAt(temp) == 'X' && s.charAt(i) == 'I'){
                sum -= 1;
            }  else if(s.charAt(temp) == 'L' && s.charAt(i) == 'X'){
                sum -= 10;
            } else if(s.charAt(temp) == 'C' && s.charAt(i) == 'X'){
                sum -= 10;
            }  else if(s.charAt(temp) == 'D' && s.charAt(i) == 'C'){
                sum -= 100;
            } else if(s.charAt(temp) == 'M' && s.charAt(i) == 'C'){
                sum -= 100;
            } else {
                sum += map1.get(s.charAt(i));
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
