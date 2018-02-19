package com.ugurayan.java.algorithm;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * can not use additional data structures?
 *
 *
 * Solution: Set the array of character value as true or false and check whether it is true !..
 *
 */
public class C1_1_unique_charecters_in_string {

    //  * Complexity is O(n)
    public static boolean isUniqueChars2(String str) {

        boolean[] char_set = new boolean[256];

        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);

            if (char_set[val]) return false;

            char_set[val] = true;

        }

        return true;
    }

    // bit vector
    // * Complexity is O(n)

    public static boolean isUniqueChars(String str) {

        int checker = 0;

        for (int i = 0; i < str.length(); ++i) {

            int val = str.charAt(i) - ‘a’;

            if ((checker & (1 << val)) > 0) return false;

            checker |= (1 << val);

        }

        return true;
    }
}
