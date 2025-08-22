package com.cognizant;

import com.cognizant.javaapp301.operation.*;
public class App {
    public static void main(String[] args) {
    	ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    	String result = armstrongNumber.verifyArmstrongNumber(153);
    	System.out.println(result);
    	
    }
}