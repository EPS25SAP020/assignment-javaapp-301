package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits";
	}

	public String verifyArmstrongNumber(int num) {
		int numLength = String.valueOf(num).length();
		int originalNumber = num;
		int sum = 0;
		if (num < 0) {
			return "-1";
		} else if (num == 0) {
			return "-2";
		} else {

			while (num != 0) {
				int lastNumber = num % 10;
				sum += Math.pow(lastNumber, numLength);
				num /= 10;

			}
		}
		if (originalNumber == sum) {

			return "Armstrong Number";
		} else if (originalNumber != sum) {
			return "Not an Armstrong Number";

		}
		return null;

	}
}