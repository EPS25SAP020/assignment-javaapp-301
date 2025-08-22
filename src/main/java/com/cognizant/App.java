package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
    	ArmstrongNumber obj = new ArmstrongNumber();

        System.out.println(obj.defineArmstrongNumber());

        int[] testInputs = {153, 51, 1634, 1504, 8208, 5105, -10, 0};
        for (int num : testInputs) {
            System.out.println("Input: " + num + " → Output: " + obj.verifyArmstrongNumber(num));
        }
    }
}