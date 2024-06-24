// Program to count occurrences of a character in a string
package com.codegnan.corejava.stringexamples;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "occurrences";
        char search = 'c';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search) {
                count++;
            }
        }
        System.out.println("The character '" + search + "' appears " + count + " times.");
    }
}
