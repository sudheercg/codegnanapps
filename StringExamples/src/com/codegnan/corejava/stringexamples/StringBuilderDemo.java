// Program to demonstrate various StringBuilder methods
package com.codegnan.corejava.stringexamples;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Java");
        // Uncomment lines to test different methods
        // StringBuilder str1 = str.append("Is a programming language");
        // System.out.println(str1);
        System.out.println(str.append(" Is a programming Language"));
        System.out.println(str.insert(4, "good"));
        System.out.println(str.reverse());
        System.out.println(str.length());
        System.out.println(str.delete(1, 4));
    }
}