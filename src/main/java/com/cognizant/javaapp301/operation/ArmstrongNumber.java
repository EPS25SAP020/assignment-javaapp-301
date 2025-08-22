package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	    public String defineArmstrongNumber() {
	        return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
	    }

	    public String verifyArmstrongNumber(int number) {
	        if (number < 0) return "-1";
	        if (number == 0) return "-2";

	        int original = number;
	        int digits = countDigits(number);
	        int sum = 0;

	        int temp = number;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += power(digit, digits);
	            temp /= 10;
	        }

	        return (sum == original) ? "Armstrong Number" : "Not an Armstrong Number";
	    }

	    private int countDigits(int num) {
	        int count = 0;
	        while (num > 0) {
	            count++;
	            num /= 10;
	        }
	        return count;
	    }

	    private int power(int base, int exp) {
	        int result = 1;
	        for (int i = 0; i < exp; i++) {
	            result *= base;
	        }
	        return result;
	    }
	}

