package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double rsl = Math.sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(3, 4, 5);
        System.out.println("area (3, 4, 5) = " + rsl);
    }
}
