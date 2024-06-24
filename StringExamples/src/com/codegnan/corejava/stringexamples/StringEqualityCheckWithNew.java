package com.codegnan.corejava.stringexamples;
public class StringEqualityCheckWithNew {
    public static void main(String[] args) {
        String str = new String("Welcome");
        String str1 = new String("Hyderabad");
        System.out.println(str == str1); // compares references
        System.out.println(str.equals(str1)); // compares content
    }
}