package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {

    // Guideline 4: No-argument method returning definition
    public String defineArmstrongNumber() {
        return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }

    // Guideline 5: Method to verify Armstrong number
    public String verifyArmstrongNumber(int num) {
        if (num < 0) {
            return "-1";
        }
        if (num == 0) {
            return "-2";
        }

        int originalNum = num;
        int sum = 0;
        int digits = 0;

        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == originalNum) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }
}
