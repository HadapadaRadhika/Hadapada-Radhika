package com.HadapadaRadhika;

import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    void getInput(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    void calculate() {
        switch (operation) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "sub":
                System.out.println("Result: " + (a - b));
                break;
            case "mul":
                System.out.println("Result: " + (a * b));
                break;
            case "div":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero");
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}


public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        Calculator calc = new Calculator();

	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();
	        System.out.print("Enter operation (add/sub/mul/div): ");
	        String op = sc.next();

	        calc.getInput(a, b, op);
	        calc.calculate();
	    sc.close();
	}

}
