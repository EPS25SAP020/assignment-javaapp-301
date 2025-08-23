package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits.";
	}
	public String verifyArmstrongNumber(int num1) {
		if(num1 == 0) {
			
			return "-2";
		}
		else if (num1 < 0) {
			
			return "-1";
		}
		
		int original = num1;
		int sum = 0;
		int digits = String.valueOf(num1).length();
		while(num1 > 0) {
			  int digit = num1 % 10;
			  sum += Math.pow(digit, digits);
			  num1 = num1/10;
			
		}
		if (original == sum) {
			return "Armstrong Number";
		}
		
		
		else
		{
			return "Not an Armstrong Number";
		}
		
	}

}

		
			
		
		   
		   
		
		