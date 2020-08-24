package _4_Stacks.challenges;

import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    //reverse the string and compare it with the original string
    static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {  //loop through the string from character to character
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c); //append a-z characters to string, with all punctuation and spaces removed
                stack.push(c);  //stack without all punctuation and all spaces
            }
        }
        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop()); //pop characters out and compare them with a stringBuilder
        }
        return reversedString.toString().equals(stringNoPunctuation.toString());
    }

}