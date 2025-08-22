package com.cognizant.javaapp301.operation;


public class ArmstrongNumber {

    // Method to return the definition of an Armstrong number
    public String defineArmstrongNumber() {
        return "An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.";
    }

   
    public String verifyArmstrongNumber(int number) {
        if (number < 0) return "-1";
        if (number == 0) return "-2";

        int original = number;
        int count = 0;
        int temp = number;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sum = 0;
        temp = number;

        // Calculate sum of digits raised to the power of count
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        return (sum == original) ? "Armstrong Number" : "Not an Armstrong Number";
    }
}
