// Program to check if a string is a valid shuffle of two strings
package com.codegnan.corejava.stringexamples;

public class ValidShuffleCheck {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String result = "adbcef";

        if (isShuffle(str1, str2, result)) {
            System.out.println("The string is a valid shuffle of the two strings.");
        } else {
            System.out.println("The string is not a valid shuffle of the two strings.");
        }
    }

    public static boolean isShuffle(String str1, String str2, String result) {
        if (str1.length() + str2.length() != result.length()) {
            return false;
        }

        int i = 0, j = 0, k = 0;
        while (k != result.length()) {
            if (i < str1.length() && str1.charAt(i) == result.charAt(k)) {
                i++;
            } else if (j < str2.length() && str2.charAt(j) == result.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        if (i < str1.length() || j < str2.length()) {
            return false;
        }

        return true;
    }
}
