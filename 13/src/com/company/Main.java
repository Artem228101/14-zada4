package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ и нажмите enter");
        String str = sc.next();
        char c = str.charAt(0);
        if (Character.isDigit(c)) System.out.println("это цифра");
        if (Character.isLetter(c)) System.out.println("это буква");
        if (".,:;".contains(str)) System.out.println("это пунктуация");
    }
}