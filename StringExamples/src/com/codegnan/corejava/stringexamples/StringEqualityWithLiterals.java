// Program to demonstrate String equality using literals
package com.codegnan.corejava.stringexamples;

public class StringEqualityWithLiterals {
    public static void main(String[] args) {
        String str = "Fruits";
        // String str1 = "Apple";
        String str2 = "Fruits";
        
        // By using == operator and .equals()
        // System.out.println(str == str1); // compare address
        // System.out.println(str.equals(str1)); // compare content of the String
        
        System.out.println(str == str2); // compares references
        System.out.println(str.equals(str2)); // compares content
    }
}
