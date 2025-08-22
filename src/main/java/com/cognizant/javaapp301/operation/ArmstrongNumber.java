package com.cognizant.javaapp301.operation;

public class ArmstrongNumber {

    public String defineArmstrongNumber() {
        return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }

    public String verifyArmstrongNumber(int number) {
        if (number < 0) {
            return "-1";
        }
        if (number == 0) {
            return "-2";
        }

        int original = number;
        int count = 0;
        int temp = number;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = number;
        int sum = 0;

        // Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            return "Armstrong Number";
        } else {
            return "Not an Armstrong Number";
        }
    }
}
