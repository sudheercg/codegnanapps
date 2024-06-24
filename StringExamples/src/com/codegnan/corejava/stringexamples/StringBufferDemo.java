package com.codegnan.corejava.stringexamples;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Buffer");
        // Uncomment lines to test different methods
        // System.out.println(str.length());
        // System.out.println(str.reverse());
        // System.out.println(str.charAt(2));
        // System.out.println(str.insert(1, "abc"));
        // System.out.println(str.replace(1, 6, "class"));
        System.out.println(str.delete(0, 2));
    }
}