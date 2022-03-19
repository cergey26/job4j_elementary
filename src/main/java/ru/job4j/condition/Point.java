package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y1 - y2), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 1, 5);
        System.out.println("result (1, 1) to (1, 5) " + result);
        double result1 = Point.distance(1, 1, 4, 8);
        System.out.println("result (1, 1) to (4, 8) " + result1);
    }
}
