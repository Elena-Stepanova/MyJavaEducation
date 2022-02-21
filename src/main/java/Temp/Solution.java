package Temp;

/*  Считать 6 строк и заполнить ими массив strings
удалить повторяющиеся строки из массива путем замены их значением null (не строками "null")
*/
import java.util.Scanner;

public class Solution {
    public static String[] strings; //объявлена статичная переменная типа стринг

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        strings = new String[6]; //инициализируем массив на 6 элементов. переменную повторно объявлять не надо

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scan.nextLine(); //заполняем массив строками в цикле
        }
        for (int i = 0; i < strings.length; i++) {
            String assignString = strings[i];  //в цикле создаем еще одну переменную и приравниваем ее к элементам
                                                //текущего массива, чтобы потом их сравнивать
            for (int j = i + 1; j < strings.length; j++) { //создаем цикл для сравнения текущего и виртуального значений
                if (assignString == null) { //проверяем на наличие значений null
                    break;
                }
                if (assignString.equals(strings[j])) { //сравниваем поэлементно, если true, присваиваем null
                    strings[j] = null;
                    strings[i] = null;
                }

            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", "); //выводим на печать результат
        }
    }
}

