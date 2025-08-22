package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
ArmstrongNumber checker = new ArmstrongNumber();
        
        System.out.println("Testing 153: " + checker.verifyArmstrongNumber(153));
        System.out.println("Testing 51: " + checker.verifyArmstrongNumber(51));
        System.out.println("Testing 1634: " + checker.verifyArmstrongNumber(1634));
        System.out.println("Testing 8208: " + checker.verifyArmstrongNumber(8208));
        System.out.println("Testing -10: " + checker.verifyArmstrongNumber(-10));
        System.out.println("Testing 0: " + checker.verifyArmstrongNumber(0));
    	
    }
}