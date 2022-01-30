package ru.learn.java;


import java.util.ArrayList;
import java.util.Scanner;

public class Learn2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int k,x,b,y;
        System.out.println("Введите число k");

        k = scanner.nextInt();
        System.out.println("Введите число x");
        x=  scanner.nextInt();
        System.out.println("Введите число b");
        b=scanner.nextInt();
        y = k*x+b;
        System.out.println("число Y "+y);
         }


}