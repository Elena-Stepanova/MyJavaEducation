package lesson6;

//Поиск минимального, максимального и среднего арифметического в массиве

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCalc {
    public static void main(String[] args) {
        System.out.println("Укажите длину массива  ");
        Scanner console = new Scanner(System.in);
        int control = 0;
        while (!console.hasNextInt()) {
            System.out.println("Попробуйте еще раз ");
            console.next();
        }
        int num = console.nextInt();
        if (num <= control) {
            System.out.println("Введено отрицательное число или ноль, что недопустимо. Повторите ввод\n");
            console.next();
        } else {
            System.out.println("Создан массив из " + num + " чисел");

            int[] numeric = new int[num];

            for (int i = 0; i < numeric.length; i++) {
                numeric[i] = (int) (Math.random() * 30);

            }
            System.out.println(Arrays.toString(numeric));
            System.out.println("Минимальное значение в массиве равно " + minimum(numeric));
            System.out.println("Максимальное значение в массиве равно " + maximum(numeric));
            System.out.println("Среднее арифметическое всех значений в массиве равно " + average(numeric));
        }
    }

    public static int minimum(int [] numeric){
        int minValue = numeric[0];
        for (int i = 1; i < numeric.length; i++){
            if (numeric[i] < minValue)
                minValue = numeric[i];
        }
        return (minValue);
    }

    public static int maximum(int [] numeric){
        int maxValue = numeric[0];
        for (int i = 1; i < numeric.length; i++){
            if (numeric[i] > maxValue)
                maxValue = numeric[i];
        }
        return (maxValue);
    }

    public static double average(int [] numeric){
        int sum = numeric[0];
        double aver = 0.0;
        for (int i = 1; i < numeric.length; i++){
            sum = (numeric[i] + sum) ;
        }
        return (aver = sum * 1.0 / numeric.length); //можно еще округлить до 1-2 десятичных знаков
    }
}
