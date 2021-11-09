package lesson2;

import static java.lang.Math.sqrt;

public class SecondProgram {

    double h, s1, s2;

    public static void main(String[] args) {

        System.out.println("Рассчитаем объем усечённой пирамиды,\n" +
                " \n" +
                "где:\n " +
                "h = 9 см - высота \n" +
                "s1 = 25 кв.см, s2 = 16 кв.см - площади соответственно нижнего и верхнего оснований");
        double h = 9;
        double s1 = 25;
        double s2 = 16;

        double result = vol (h,s1,s2);
        System.out.println("\n" +
                "Объем пирамиды равен " + result + " куб.см");
    }

        public static double vol(double h, double s1, double s2) {
            double vol = h/3 * (s1 + sqrt(s1*s2) + s2);
            return vol;
    }
}
