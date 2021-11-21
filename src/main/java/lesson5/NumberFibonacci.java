package lesson5;

//Вычисление n-ного члена последовательности Фибоначчи методом рекурсии

import java.util.Scanner;

public class NumberFibonacci {
    public static void main(String[] args) {
        System.out.println("Введите номер элемента ");

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Попробуйте еще раз ");
        }

        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Введено отрицательное число. Запустите программу заново");
        }else
        System.out.println(n + "-й член последовательности Фибоначчи равен  " + numberFib(n));
    }
    public static int numberFib(int n){
                if (n == 0) {
                    return 0;
                } else if (n == 1) {
                    return  1;
                } else {
                    return (numberFib(n - 1) + numberFib(n - 2));
                }
        }
    }
