package ru.learn.java;


import java.util.Scanner;

public class Learn2 {

    public static void main(String[] args) {
        // массивы данных


        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal " + min);
    }
}


