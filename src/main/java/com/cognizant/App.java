package com.cognizant;
import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
	public static void main(String[] args) {
		ArmstrongNumber armStrongNumber = new ArmstrongNumber();
		int[] testCases = {153, 51, 1634, 1504, 8208, 5105, -10, 0};

        for (int num : testCases) {
            System.out.println(armStrongNumber.verifyArmstrongNumber(num));
	}
}
}
