package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double i = (amount + amount * (percent / 100) - salary);
        while (i >= 0) {
            i = (i + i * (percent / 100) - salary);
            year += 1;
        }
        return year;
    }
}
