package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {

    public String defineArmstrongNumber() {
        return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }

    public String verifyArmstrongNumber(int num) {
        if (num < 0) {
            return "-1";
        }
        if (num == 0) {
            return "-2";
        }

        int original = num;
        int count = 0;
        int temp = num;

        
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        
        while (temp > 0) {
            int lastDigit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= lastDigit;
            }
            sum += power;
            temp = temp / 10;
        }

        
        if (sum == original) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }
}
