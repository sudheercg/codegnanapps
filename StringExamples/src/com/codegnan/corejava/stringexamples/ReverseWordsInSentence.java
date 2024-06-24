// Program to reverse the words in a sentence
package com.codegnan.corejava.stringexamples;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence += words[i] + " ";
        }
        System.out.println(reversedSentence.trim());
    }
}
