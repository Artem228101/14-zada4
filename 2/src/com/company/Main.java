package com.company;
public class Main {
    public static void main(String[] args) {
        int[] num = new int[2];
        num[0] = 10;
        num[1] = 22;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (num[i] * 1.1);
            System.out.println(num[i]);
        }
    }
}