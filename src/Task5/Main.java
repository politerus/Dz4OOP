package Task5;

import java.util.Scanner;

public class Main extends ConverterTemperature{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите сколько грудусов целься Вы хотите конвертирывать!");
        double temperature = input.nextDouble();
        ConverterTemperature.converter(temperature);
    }
}
  /* Напишіть на ConverterTemperature клас для конвертації
    з градусів за Цельсієм в Кельвіни, Фаренгейти.
     У класу має бути метод convert, який робить конвертацію. */