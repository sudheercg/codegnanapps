// Program to check if a string contains only digits
package com.codegnan.corejava.stringexamples;

public class StringContainsOnlyDigits {
    public static void main(String[] args) {
        String str = "123456";
        boolean isDigitOnly = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isDigitOnly = false;
                break;
            }
        }
        if (isDigitOnly) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }
}
