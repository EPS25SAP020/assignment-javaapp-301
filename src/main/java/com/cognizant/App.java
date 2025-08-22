package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
    	ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    	armstrongNumber.defineArmstrongNumber();
    	armstrongNumber.verifyArmstrongNumber(153);
    }
}