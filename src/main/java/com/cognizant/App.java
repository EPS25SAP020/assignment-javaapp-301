package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
    	
    	ArmstrongNumber armstrongnumber = new ArmstrongNumber();
    	System.out.println(armstrongnumber.defineArmstrongNumber());
    	System.out.println(armstrongnumber.verifyArmstrongNumber(153));
    	System.out.println(armstrongnumber.verifyArmstrongNumber(678));
    	
    	
    	
    }
}