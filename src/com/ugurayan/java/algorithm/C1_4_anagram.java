package com.ugurayan.java.algorithm;

import java.util.Arrays;

/**
 * Write a method to decide if two strings are anagrams or not.
 */
public class C1_4_anagram {

    boolean anagram(String s, String t) {
        return sort(s) == sort(t);
    }

    String sort(String str) {
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
