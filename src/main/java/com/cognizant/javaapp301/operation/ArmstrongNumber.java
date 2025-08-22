package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the number of digits in the number";
	}
	
	public String verifyArmstrongNumber(int num) {
		int numberOfdigits = 0;
		int temp = num;
		
		while(temp > 0) {
			temp /= 10;
			numberOfdigits++;
		}
		
		temp = num;
		int sum = 0;
		String result = "";
		while(temp > 0) {
			int digit = temp%10;
			sum += Math.pow(digit, numberOfdigits);
			temp/=10;
		}
		
		if (num < 0) {
			result = "-1";
		} else if (num == 0) {
			result = "-2";
		} else if (num == sum) {
			result = "Armstrong Number";
		} else {
			result = "Not an Armstrong Number";
		}
		return result;
	}
}
