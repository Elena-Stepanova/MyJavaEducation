package lesson4;

import java.util.Scanner;

public class SquareRoot {

    // Вычисление квадратного корня числа методом подбора

    public static void main(String[] args) {
        System.out.println("Введите целое число для вычисления квадратного корня:  ");
        Scanner concole = new Scanner(System.in);
        int num = concole.nextInt();

        if (num < 0) {
            System.out.println("Вы ввели отрицательное число.\n" +
                    "Квадратного корня из отрицательных чисел не существует.\n" +
                    "Запустите программу заново и введите другое число");
        } else if (num == 0) {
            System.out.println("Квадратный корень из нуля равен 0");
        } else {
            System.out.println("Квадратный корень из числа " + num + " равен " + findSquareRoot(num) + " либо "
                    + -(findSquareRoot(num)));
        }
    }

    public static double findSquareRoot(int num){

        double tmp = 0;
        double sqroot = 0;
        do{
            tmp+=0.00001;
            sqroot = num - tmp * tmp;
        } while (!(sqroot <= 0));

        return tmp;
        }
    }
