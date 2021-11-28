package lesson6;

import java.util.Scanner;

public class CashFibonacci {
    public static void main(String[] args) {
        System.out.println("Введите номер элемента не более 20 ");
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            String s = scanner.nextLine();
            if (s.equals("stop")) {
                break;
            }else {
                scanner.next();
                System.out.println("Попробуйте еще раз ");
            }
        }
/*        while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Попробуйте еще раз ");
           }
        }
*/
        int n = scanner.nextInt();

    if (n < 0){
            System.out.println("Введено отрицательное число. Запустите программу заново");
        }else
            System.out.println(n + "-й член последовательности Фибоначчи равен  " + numberFib(n));
/*
            int[] arrayCash = new int[20];
            int index = 0;
            for (index = 0; index < arrayCash.length; index++) {
                arrayCash[index] = numberFib(n);
            }*/
    }
    public static int numberFib(int n){

        while (n < 20) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
        }
        return (numberFib(n - 1) + numberFib(n - 2));
    }
}
