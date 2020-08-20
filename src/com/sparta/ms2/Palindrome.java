package com.sparta.ms2;

public class Palindrome {
    public boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int goesforward = 0;
        int goesbackward = length - 1;
        while (goesbackward > goesforward) {
            char forwardChar = clean.charAt(goesforward++);
            char backwardChar = clean.charAt(goesbackward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
