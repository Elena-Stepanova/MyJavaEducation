package lesson3;

import java.util.Scanner;

public class FactorialTwo {

    public static void main(String[] args) {
        int fact = 0;

        System.out.println("Рассчитаем факториал заданного числа");

        Scanner keyboard = new Scanner(System.in); //инициализируем объект типа Scanner для чтения с консоли
        System.out.println("Введите целое число ");

        if (keyboard.hasNextInt()) { //метод проверяет, являются ли введенные данные числом
            fact = keyboard.nextInt(); //считываем данные с клавиатуры и сохраняем в перем. fact
            System.out.println("Спасибо! Вы ввели число " + fact);
        } else {
            System.out.println("Введенное значение не является числом.\n" +
                    " Перезапустите программу и попробуйте снова!");
            keyboard.close(); //закрыли поток
            return;
        }
        int result = factorial(fact);
        System.out.println("Факториал числа " + fact + " равен " + result);
    }
    public static int factorial(int fact) {
           if (fact == 0) {
            return 1;
        } else {
            return fact * factorial(fact - 1);
        }
    }

}
