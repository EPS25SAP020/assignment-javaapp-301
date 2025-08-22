package com.cognizant;

import com.cognizant.javaapp301.operation.ArmstrongNumber;

public class App {
    public static void main(String[] args) {
    	ArmstrongNumber armstrongNumber = new ArmstrongNumber();
    	
    	String define = armstrongNumber.defineArmstrongNumber();
    	//System.out.println(define);
    	
    	int num = 1504;
    	
    	String result = armstrongNumber.verifyArmstrongNumber(num);    	
    	//System.out.println(result);
    	
    }
}