package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {

	public  String defineArmstrongNumber() {
		return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
	}

	public  String verifyArmstrongNumber(int number) {
		if (number < 0) {
			return "-1";
		}
		if (number == 0) {
			return "-2";
		}

		int original = number;
		int digits = 0;
		int temp = number;

		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}

		int result = 0;
		temp = number;

		while (temp != 0) {
			int digit = temp % 10;
			int power = 1;

			for (int i = 0; i < digits; i++) {
				power = power * digit;
			}

			result = result + power;
			temp = temp / 10;
		}

		if (result == original) {
			return "Armstrong Number";
		} else {
			return "Not an Armstrong Number";
		}
	}
}
