package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {

	public String defineArmstrongNumber() {

		String def = "A number that is equal to the sum of its own digits each raised to the power of the number of digits.";

		return def;
	}

	public String verifyArmstrongNumber(int num) {

		if (num < 0) {

			return "-1";
		}

		else if (num == 0) {

			return "-2";
		}

		else {
			int dup = num;
			int l = String.valueOf(num).length();
			int sum = 0;

			while (dup > 0) {
				int rem = dup % 10;

				sum += Math.pow(rem, l);
				num = num / 10;
			}

			if (num == sum) {

				return "Armstrong Number";
			} else {

				return "Not an Armstrong Number";
			}
		}
	}
}
