package com.cognizant.javaapp301.main;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
        ArmstrongNumber arm = new ArmstrongNumber();

        System.out.println(arm.defineArmstrongNumber());

        int[] testInputs = {153, 51, 1634, 1504, 8208, 5105, -10, 0};

        for (int num : testInputs) {
            System.out.println("Input: " + num + " → Output: " + arm.verifyArmstrongNumber(num));
        }
    }
}
