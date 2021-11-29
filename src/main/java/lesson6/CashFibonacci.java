package lesson6;


import java.util.Scanner;

public class CashFibonacci {
    static int limit = 20;
    public static void main(String[] args) {

        System.out.printf("Введите положительное число не более %d\n", limit);
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
            } else if (scanner.hasNextLine() && scanner.nextLine().equals("stop")) {
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

    public static int[] fibgen() {
        int[] accumulator = new int[limit];
        int s = 0;
        int fib = numberFib(s);
        while (fib < limit) {
            accumulator[s] = fib;
            if ((accumulator[0] == 0) || (accumulator[s] > 0)){
                continue;
            }
            s += 1;
            fib = numberFib(s);
        }
        return accumulator;
    }

}

