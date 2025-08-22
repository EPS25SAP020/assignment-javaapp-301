package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
    	
    	        ArmstrongNumber arm = new ArmstrongNumber();

    	        System.out.println(arm.defineArmstrongNumber());
    	        System.out.println("Input: 153 → " + arm.verifyArmstrongNumber(153));
    	        System.out.println("Input: 51 → " + arm.verifyArmstrongNumber(51));
    	        System.out.println("Input: -10 → " + arm.verifyArmstrongNumber(-10));
    	        System.out.println("Input: 0 → " + arm.verifyArmstrongNumber(0));
    }
}