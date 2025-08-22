package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {
	public String defineArmstrongNumber() {
		return "Armstrong Number is a number that is equal to the sum of its own digits each raised to the power of the number of digits";
	}
	public String verifyArmstrongNumber(int num) {
		if (num < 0) {
			return "-1";
		}else if(num == 0) {
			return "-2";
		}
		
		int x = num;
		int y = num;
		int len = 0;
		while(y > 0) {
			y /= 10;
			len ++;
		}
		
		int result = 0;
		
		while(num>0) {
			int temp = num%10;
			int powered = 1;
			for (int i = 0; i < len; i++) {
			    powered *= temp;
			}
			result += powered;
			num /= 10;
		}
		if(result == x) {
			return "Armstrong Number";
		}else {
			return "Not an Armstrong Number";
		}
	}
}
