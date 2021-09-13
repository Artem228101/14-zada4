package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число:");
        double number = new Scanner(System.in).nextDouble();
        isInteger(number);
    }
    static void isInteger(double number) {
        if (number % 1 == 0) System.out.println("Целое число.");
        else System.out.println("Нецелое число.");
    }
}