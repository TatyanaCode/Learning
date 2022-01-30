package ru.learn.java;

import java.util.Scanner;

/*
* Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
* */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] f = new int[a][a];
       for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                if (j == 0 || j == (a - 1)) {
                    f[i][j] = 1;
                } else {
                    f[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }

        /*Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.*/
        boolean l = true;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                if (l) {
                    f[i][j] = 0;
                    l = false;
                } else {
                    f[i][j] = 1;
                    l = true;
                }
            }
        }

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++) {
                System.out.print(f[i][j]);
            }
            System.out.println();
        }
    }
}
