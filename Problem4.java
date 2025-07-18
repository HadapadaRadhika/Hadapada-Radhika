package com.HadapadaRadhika;
import java.util.LinkedHashMap;
import java.util.Map;
public class Problem4 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

	        Map<Integer, Integer> map = new LinkedHashMap<>();

	        // Count how many numbers are divisible by 1 to 9
	        for (int i = 1; i <= 9; i++) {
	            int count = 0;
	            for (int num : arr) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            map.put(i, count);
	        }

	        System.out.print("{");
	        int size = map.size();
	        int index = 0;
	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            System.out.print(entry.getKey() + ": " + entry.getValue());
	            if (++index < size) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("}");
	    }
	} 
