package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed1 = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed1);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        boolean passed2 = expected == out;
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
    }
}
