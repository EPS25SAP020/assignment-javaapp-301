package com.cognizant.javaapp301.operation;


import com.cognizant.javaapp301.operation.ArmstrongNumber;


public class App {
    public static void main(String[] args) {
        ArmstrongNumber armstrong = new ArmstrongNumber();

        System.out.println("Definition: " + armstrong.defineArmstrongNumber());

        int[] testInputs = {153, 51, 1634, 1504, 8208, 5105, -10, 0};

        for (int input : testInputs) {
            String result = armstrong.verifyArmstrongNumber(input);
            System.out.println("Input: " + input + " → Output: " + result);
        }
    }
}

