// Program to reverse a given string
package com.codegnan.corejava.stringexamples;

public class StringReversal {
    public static void main(String[] args) {
        String str = "Chair";
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            rev = c + rev;
            System.out.println("a:"+rev);
        }
        System.out.println(rev);
    }
}
