package Lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();

        compareNumbers();

        System.out.println();

        printColor();

        System.out.println();

        checkSumSign();

    }

    private static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b)
            System.out.println("a >= b");

        else System.out.println("a < b");
    }

    private static void printColor() {
        int value = 10;

        if (value <= 0)
            System.out.println("Красный");

        else if (value > 0 && value <= 100)
            System.out.println("Желтый");

        else System.out.println("Зеленый");
    }
    private static void checkSumSign() {
        int A = 10;
        int B = 5;
        int C = A + B;

        if (C >= 0)
            System.out.println("Сумма положительная");

        else System.out.println("Сумма отрицательная");
    }
}
