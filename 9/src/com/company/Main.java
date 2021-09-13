package com.company;
public class Main {
    private static boolean isPalindrome(String src) {
        src = src.replaceAll("[\s]", "").toLowerCase();
        boolean result = true;
        for (int i = 0; i < src.length() / 2; i++) {
            if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(Integer.toString(688777886)));
        System.out.println(isPalindrome(Integer.toString(23)));
    }
}