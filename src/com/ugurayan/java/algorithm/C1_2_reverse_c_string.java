package com.ugurayan.java.algorithm;

/**
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as
 * five characters, including the null character.)
 */
public class C1_2_reverse_c_string {

    // C Code
    /*void reverse(char *str) {
        char * end = str;
        char tmp;
        if (str) {
            while (*end) {
                ++end;
            }
            --end;
            while (str < end) {
                tmp = *str;
                *str++ = *end;
                *end-- = tmp;
            }
        }
    }*/

    public String reverse(String str) {

        StringBuilder temp = new StringBuilder(str);
        int lngth= str.length();
        for (int i = 0; i < lngth; i++){
            temp.setCharAt(lngth - i, str.charAt(i));
        }

        return temp.toString();
    }
}
