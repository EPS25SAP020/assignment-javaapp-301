package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "a number that is equal to the sum of its digits, each raised to the power of the number of digits";
	}
	
	public String verifyArmstrongNumber(int num) {
		if(num < 0) {
			return "-1";
		}
		
		if(num == 0) {
			return "-2";
		}
		
		int temp,power=0,i=num,j=num,sum = 0;
		
		while(i!=0) {
			power++;
			i /= 10;
		}
		
		while(j!=0) {
			int digit = j%10;
			
			temp=digit;
			
			for(i=1;i<power;i++) {
				temp *= digit;
			}
			
			sum += temp;
			j /= 10;
		}
		
		if(sum == num) {
			return "Armstrong Number";
		}
		return "Not an Armstrong Number";
	}
}
