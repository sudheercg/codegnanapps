// Program to demonstrate String equality using new keyword
package com.codegnan.corejava.stringexamples;

public class StringEqualityWithNewKeyword {
    public static void main(String[] args) {
        String sr = new String("Vehicle");
        String sr1 = new String("Vehicle");
        
        System.out.println(sr == sr1); // compares references
        System.out.println(sr.equals(sr1)); // compares content
    }
}
