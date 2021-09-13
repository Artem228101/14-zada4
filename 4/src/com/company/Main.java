package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double v = 330.0; //скорость звука
        double t, s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите временной промежуток между вспышкой молнии и громом (секунд):");
        t = scanner.nextDouble();
        s = t * v;
        System.out.println("Расстояние до места удара молнии: " + s + " метров");
    }
}