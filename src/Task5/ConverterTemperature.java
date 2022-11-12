package Task5;

import java.util.Scanner;

public class ConverterTemperature {

    public static void converter(double temperature) {
        System.out.println(temperature + "градусов Цельсия это: " + (temperature + 273.15) + "  градусов по Кельвину");
        System.out.println(temperature + " градусов Цельсия это: " + ((temperature * 9 / 5) + 32) + " градусов  по Фаренгейту");
    }
}
