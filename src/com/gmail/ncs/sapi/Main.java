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
        int testNumber = Math.abs(number);      // create a testNumber value to count with, number variable will be same
        int numeral = 0;                      // create a numeral variable to build the new number
        while (testNumber >= 10) {
            //System.out.println(numeral);
            int inverse;                        // variable for inverse digits
            inverse = testNumber % 10;          // get the inverse digit from right to the left.
            numeral += inverse;               // build numeral, add digits.
            //System.out.println(numeral);
            testNumber = testNumber / 10;
            if (testNumber <= 10) {             // test for last digit and add.
                numeral *= 10;
                numeral += testNumber;
                return Math.abs(number) == numeral;   // return true or false
            }
            numeral *= 10;                    // move the digit to the left, in the numeral.
        }
        return Math.abs(number) == numeral;
    }
}
