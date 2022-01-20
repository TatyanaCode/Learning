package ru.learn.java;


import java.util.Scanner;

public class Learn2 {

    public static void main(String[] args) {
        // Многомерные массивы данных
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        syms[1][1] = 'g';
//        System.out.println(syms[0][0]);
//        byte[][] nums = new byte[][]{
//                {5, 7},
//                {7, 3},
//                {2, 0}
//        };
//
//        nums[1][1] = 22;
//        System.out.println(nums[1][1]);
//        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < syms[0].length; i++){
            for(int j = 0; j < syms[1].length; j++){
                System.out.println(syms[i][j]);
            }
        }
    }
}