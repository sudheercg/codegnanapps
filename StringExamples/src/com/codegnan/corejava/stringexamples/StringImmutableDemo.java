// Program to demonstrate String immutability and concatenation
package com.codegnan.corejava.stringexamples;

public class StringImmutableDemo {
    public static void main(String[] args) {
        String str = "Arcus";
        // str.concat("Institute");
        // System.out.println(str); // str remains unchanged
        str = str.concat("Institute");
        System.out.println(str); // str is now changed
    }
}