package ru.learn.java;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите значение \"a\" ");
                a = scanner.nextDouble();
                System.out.println("Введите значение \"b\" ");
                b = scanner.nextDouble();
                System.out.println("Введите значение \"c\" ");
                c = scanner.nextDouble();
                // D=b^{2}-4ac.
                d = b * b - 4 * a * c;
                System.out.println("Дискриминант D =  " + d);
                if (d < 0) {
                    System.out.println("Нет корней");
                } else {
                    double x1;
                    double x2;
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    System.out.println("Корни уравнения:");
                    if (d != 0) {
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    } else {
                        System.out.println("x = " + x1);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!scanner.nextLine().equals("N"));
    }
}
