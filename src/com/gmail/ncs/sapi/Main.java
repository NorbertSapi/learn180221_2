package com.gmail.ncs.sapi;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(inverseNumber(1595));
        System.out.println(inverseNumber(353));
        System.out.println(inverseNumber(-121));
        System.out.println(inverseNumber(125));
    }

    public static boolean inverseNumber(int number) {
        int testNumber = Math.abs(number);      // create a testNumber value to count with.
        int newNumber = 0;                      // create a newNumber value to build the new number
        while (testNumber >= 10) {
            //System.out.println(newNumber);
            int inverse;                        // variable for inverse digits
            inverse = testNumber % 10;          // increase the value of the digit to put it in the right place.
            newNumber += inverse;               // build new inverse number
            //System.out.println(newNumber);
            testNumber = testNumber / 10;       // test for last digit and add.
            if (testNumber <= 10) {
                newNumber *= 10;
                newNumber += testNumber;
                return Math.abs(number) == newNumber;   // return true or false
            }
            newNumber *= 10;                    // move the digit to the left, in the number value place.
        }
        return Math.abs(number) == newNumber;
    }
}
