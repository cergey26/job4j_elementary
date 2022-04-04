package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        Boolean prime = true;
        for (int i = 2; i < number - 1; i++) {
            if ((number % i) == 0) {
                break;
            }
            return prime;
        }
        return false;
    }
}