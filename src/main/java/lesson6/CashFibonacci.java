package lesson6;


import java.util.Scanner;

public class CashFibonacci {
    static int limit = 40;

    public static void main(String[] args) {
        int topLimit = limit + 1; //увеличиваем лимит на 1, чтобы  член последовательности, соответствующий лимиту тоже
                                  //рассчитывался, т.к. счет идет с нуля, а не с 1
        int[] fibonacciAccum = new int[topLimit]; //инициализируем массив для кэша
        System.out.printf("Введите позицию в ряде Фибоначчи как целое положительное число не более %d \n", limit);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n >= 0 && n < topLimit) {
                    if (fibonacciAccum[n] != 0) { //тут сначала смотрим в нашем кэше отличное от нуля значение, вдруг мы его посчитали и сохранили ранее
                        System.out.println(n + "-й член последовательности Фибоначчи был рассчитан ранее и помещён в кэш.\n" +
                                "Он равен  "  + fibonacciAccum[n]); //Тут сразу достаем это значение из кэша и выводим на консоль, ничего не считая

                    } else { //сюда попадаем, если в кэше нашего значения ещё нет, и нам надо его посчитать
                        int value = numberFib(n, fibonacciAccum); //тут вызываем метод нахождения числа и заодно передаем в метод наш массив,
                                                                // чтобы пока будем считать сразу сохранить в него всё, что посчитаетсяя
                        System.out.println(n + "-й член последовательности Фибоначчи равен  " + value); //выводим на консоль найденное значение
                    }
                } else {
                    System.out.printf("Введено отрицательное число или число больше %d. Попробуйте снова\n", limit);
                    continue;
                }
            } else if (scanner.nextLine().equalsIgnoreCase("stop")) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Ошибка при обработке ввода. Попробуйте снова");
                continue;
            }

        }
    }

    public static int numberFib(int n, int[] fibonacciAccum) {

        if (n == 0 || n == 1) {
            fibonacciAccum[n] = n; //тут записываем в кэш значения
            return n;
        } else {
            int fibValue = (numberFib(n - 1, fibonacciAccum) + numberFib(n - 2, fibonacciAccum)); //находим значение из последовательности
            fibonacciAccum[n] = fibValue; //когда нашли его, то записываем в кэш под тем номером, под каким оно находится в последовательности
            return fibValue;
        }

    }
}

/*
По поводу того, что после ввода числа, когда вводится строка вылезает два раза сообщение "Ошибка при обработке ввода. Попробуйте снова",
проблема в том, что когда вызывается у объекта scanner любой из методов next (nextInt, nextLine и др.), то в этот момент
управление программы передается консоли и ожидается ввод.
Так как у вас вызывается в одном из условии такой метод:
scanner.nextLine().equalsIgnoreCase("stop")

while (true) {
    String input = scanner.next();
    if (isNumber(input)) {
        int n = Integer.parseInt(input);
        if (n >= 0 && n < topLimit) {
           ... //дальше идет код без изменений
    } else if (input.equalsIgnoreCase("stop")) { //тут проверяется введенная строка из консоли, которую записали в переменную в самом начале цикла
        System.out.println("Программа завершена");
        break;
    } else {
        System.out.println("Ошибка при обработке ввода. Попробуйте снова");
        continue;
    }
 */