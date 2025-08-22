package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
    	ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    	System.out.println(armstrongNumber.defineArmstrongNumber());
    	System.out.println(armstrongNumber.verifyArmstrongNumber(153));

    	
    }
}