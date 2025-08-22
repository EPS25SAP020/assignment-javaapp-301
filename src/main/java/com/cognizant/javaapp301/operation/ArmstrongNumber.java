package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber () {
		return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }
	
	public String verifyArmstrongNumber(int number) {
		int numberOfdigits = 0;
        int temp = number;
        
        while (temp > 0) {
            temp /= 10;
            numberOfdigits++;
            
        }

        
        temp = number;
        int sum = 0;
        String result = "";
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfdigits);
            temp/=10;
        }

        if (number < 0) {
        	result = "-1";
        }else if (number == 0) {
        	result = "-2";
        }else if (number == sum) {
        	result = "Armstrong Number";
        }else {
        	result = "Not an Armstrong Number";
        }
        return result;
	}
}
