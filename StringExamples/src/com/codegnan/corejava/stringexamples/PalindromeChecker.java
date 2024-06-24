package com.codegnan.corejava.stringexamples;
public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("Given string is a palindrome");
        } else {
            System.out.println("Given string is not a palindrome");
        }
    }
}