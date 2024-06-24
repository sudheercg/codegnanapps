package com.codegnan.corejava.stringexamples;
public class StringEqualityCheck {
    public static void main(String[] args) {
        String str = "Arcus";
        String str2 = "Arcus";
        System.out.println(str == str2); // compares references
        System.out.println(str.equals(str2)); // compares content
    }
}