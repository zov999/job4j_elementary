package ru.job4j.converter;

public class ConverterConverter {


        public static int rubleToEuro(int value) {
            int rsl = value / 70;
            return rsl;
        }

        public static int rubleToDollar(int value) {
            int rsl = value / 60; /* ������� �������� ������ � �������. */
            return rsl;
        }

        public static void main(String[] args) {
            double euro = Converter.rubleToEuro(140);
            double dollar = Converter.rubleToDollar(180);
            System.out.println("140 rubles are " + euro + " euro.");
            int in = 140;
            int expected = 2;
            int out = rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are 2. Test result : " + passed);
            System.out.println("180 rubles are " + dollar + " dollar.");
            in = 180;
            expected = 3;
            out = rubleToDollar(in);
            passed = expected == out;
            System.out.println("180 rubles are 3. Test result : " + passed);
        }
    }