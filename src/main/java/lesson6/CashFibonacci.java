package lesson6;


import java.util.Scanner;

public class CashFibonacci {
    static int limit = 20;
    public static void main(String[] args) {

        System.out.printf("Введите позицию в ряде Фибоначчи как целое положительное число не более %d\n", limit);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n >= 0 && n <= limit) {
                    System.out.println(n + "-й член последовательности Фибоначчи равен  " + numberFib(n));
                } else {
                    System.out.printf("Введено отрицательное число или число больше %d. Попробуйте снова\n", limit);
                    continue;
                }
            } else if (scanner.hasNextLine() && scanner.nextLine().equalsIgnoreCase("stop")) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Ошибка при обработке ввода. Попробуйте снова");
                continue;
            }

        }
    }

    public static int numberFib(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {
            return (numberFib(n - 1) + numberFib(n - 2));
        }

    }
/*
    public static int[] fibGen(int[] fibonacciAccum, int numberFib) {
        int[] fibonacciAccum = new int[limit];
        int s = 0;
        int fib = numberFib(s);
        while (fib < limit) {
            fibonacciAccum[s] = fib;
            if ((fibonacciAccum[0] == 0) || (fibonacciAccum[s] > 0)){
                System.out.printf("Значение с индексом %d было расчитано и размещено в кэше\n", s);
                continue;
            }
            s += 1;
            fib = numberFib(s);
        }
        return fibonacciAccum;
    }
*/
}

