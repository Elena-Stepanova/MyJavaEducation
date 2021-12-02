package lesson6;

//Поиск минимального, максимального и среднего арифметического в массиве

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCalc {
    public static void main(String[] args) {
        System.out.println("Укажите длину массива  ");
        Scanner console = new Scanner(System.in);
        while (console.hasNextInt()) {  //Цикл проверки входящих значений
            int num = console.nextInt();
            if (num > 0) {
                System.out.println("Создан массив из " + num + " чисел");
                int[] numeric = new int[num];

                for (int i = 0; i < numeric.length; i++) {
                    numeric[i] = (int) (Math.random() * 30);
                }
                System.out.println(Arrays.toString(numeric));
                System.out.println("Минимальное значение в массиве равно " + minimum(numeric));
                System.out.println("Максимальное значение в массиве равно " + maximum(numeric));
                System.out.println("Среднее арифметическое всех значений в массиве равно " + average(numeric));
                System.exit(0); //выход из потока
            }else {
                System.out.println("Введено отрицательное число или ноль, что недопустимо. Попробуйте еще раз\n");
                continue;
            }
            }
            if (console.hasNextLine()) {
                System.out.println("Введенное значение должно быть числом. Программа завершена. Запустите заново ");
            }

        }
// Выбор минимального значения в массиве простым перебором
    public static int minimum(int [] numeric){
        int minValue = numeric[0];
        for (int i = 1; i < numeric.length; i++){
            if (numeric[i] < minValue)
                minValue = numeric[i];
        }
        return (minValue);
    }
// Выбор максимального значения методом Math.max
    public static int maximum(int[] numeric){
        int maxValue = numeric[0];
//        for (int i = 1; i < numeric.length; i++){
//            if (numeric[i] > maxValue)
//            maxValue = numeric[i];
        for (int i: numeric){
            maxValue = Math.max(maxValue, i);
        }
        return (maxValue);
    }
// Вычисление среднего арифметического
    public static double average(int [] numeric){
        int sum = numeric[0];
        for (int i = 1; i < numeric.length; i++){
            sum = (numeric[i] + sum) ;
        }
        return (sum * 1.0 / numeric.length); //можно еще округлить до 1-2 десятичных знаков
    }
}
