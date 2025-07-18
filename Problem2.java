package com.HadapadaRadhika;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        int a = sc.nextInt();

	        int num = 1;
	        for (int i = 0; i < a; i++) {
	            System.out.print(num);
	            if (i < a - 1)
	                System.out.print(", ");
	            num += 2;
	            sc.close();
	        }
	}

}
