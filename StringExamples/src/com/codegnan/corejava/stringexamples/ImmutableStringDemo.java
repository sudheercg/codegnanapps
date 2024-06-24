package com.codegnan.corejava.stringexamples;
public class ImmutableStringDemo {
    public static void main(String[] args) {
        String str = "java";
        String str1 = "Programming";
        str = str.concat(str1); // Concatenates str1 to str and reassigns to str
        System.out.println(str);
    }
}