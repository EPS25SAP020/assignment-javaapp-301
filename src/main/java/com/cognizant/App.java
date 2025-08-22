package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
	public static void main(String[] args) {

		ArmstrongNumber armstrongNumber = new ArmstrongNumber();

		System.out.println("Definition: " + armstrongNumber.defineArmstrongNumber());

		System.out.println("Input: 153 → Output: " + armstrongNumber.verifyArmstrongNumber(153));
		System.out.println("Input: 51 → Output: " + armstrongNumber.verifyArmstrongNumber(51));
		System.out.println("Input: 1634 → Output: " + armstrongNumber.verifyArmstrongNumber(1634));
		System.out.println("Input: 1504 → Output: " + armstrongNumber.verifyArmstrongNumber(1504));
		System.out.println("Input: 8208 → Output: " + armstrongNumber.verifyArmstrongNumber(8208));
		System.out.println("Input: 5105 → Output: " + armstrongNumber.verifyArmstrongNumber(5105));
		System.out.println("Input: -10 → Output: " + armstrongNumber.verifyArmstrongNumber(-10));
		System.out.println("Input: 0 → Output: " + armstrongNumber.verifyArmstrongNumber(0));

	}
}
