package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits in the number.";
	}
	
	private int power(int base, int power) {
		int res = 1;
		while(power != 0) {
			res *= base;
			power--;
		}
		return res;
	}
	
	public String verifyArmstrongNumber(int number) {
        if (number < 0) {
            return "-1";
        }
        if (number == 0) {
            return "-2";
        }

        int temp = number;
        int numberOfDigits = 0;
        
        while (temp != 0) {
            temp /= 10;
            numberOfDigits++;
        }
        
        temp = number;
        long sum = 0;
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += power(digit, numberOfDigits);
            temp /= 10;
        }
        
        if (sum == number) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }
}
