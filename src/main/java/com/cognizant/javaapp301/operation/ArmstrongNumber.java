package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "An Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits.";
	}
	public String verifyArmstrongNumber(int number) {
        
        if (number < 0) {
            return "-1";
        }
        if (number == 0) {
            return "-2";
        }
        int originalNumber = number;
        int sum = 0;
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
    	
    }
        temp = originalNumber;
        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, count);
            temp /= 10;
        }
        if (sum == originalNumber) {
            return "Armstrong Number";
        } 
        else {
            return "Not an Armstrong Number";
        }
	}
	private int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}
