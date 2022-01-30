package ru.learn.java;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Learn2 {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String console;
        do{
            System.out.println("Введите координату X");
            console = scanner.nextLine();
            try{
                double x = Double.parseDouble(console);
                System.out.println("Введите координату Y");
                console = scanner.nextLine();
                double y = Double.parseDouble(console);
                points.add(new Point(x, y));
            } catch (Exception e){
                System.out.println("Введена неверная координата");
            }
        }
        while(!console.equals("N"));


        Point barycenter = barycenter(points);

        System.out.println("Координата X = " + barycenter.getX());
        System.out.println("Координата Y = " + barycenter.getY());

//        int k, x, b, y;
//        System.out.println("Введите число k");
//
//        k = scanner.nextInt();
//        System.out.println("Введите число x");
//        x = scanner.nextInt();
//        System.out.println("Введите число b");
//        b = scanner.nextInt();
//        y = k * x + b;
//        System.out.println("число Y " + y);
    }

    /*
        Метод для нахождения барицентра фигуры
        */
    static public Point barycenter(List<Point> coordinates) {
        double x = 0;
        double y = 0;
        for (Point item : coordinates) {
            x += item.getX();
            y += item.getY();
        }
        int listSize = coordinates.size();
        return new Point((x / listSize), (y / listSize));
    }
}