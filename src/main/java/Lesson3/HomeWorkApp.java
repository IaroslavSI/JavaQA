package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        // Задание 1.
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int arrll = arr.length;
        for (int i = 0; i < arrll; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        for (int i = 0; i < arrll; i++) {
            System.out.println(i + "-" + arr[i]);
        }

        // Задание 2.

        int[] array = new int[101];
        int j = 1;
        int fill = array.length;
        System.out.println();

        for (int i = 1; i < fill; ++i, j = j + 1) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.println();
        }

        //Задание 3.
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int arr3 = array3.length;
        for (int i = 0; i < arr3; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        System.out.println();

        for (int i = 0; i < arr3; i++) {

            System.out.print(+array3[i] + ", ");
            System.out.println();

        }
        //Задание 4.

        int[][] sqArr = new int[2][2];
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                if (i < j) {
                    sqArr[i][j] = 0;
                } else if (i > j) {
                    sqArr[i][j] = 1;
                } else {
                    sqArr[i][j] = 1;
                }
                System.out.print(sqArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        //Задание 5.
        ex5();

    }

    private static void ex5() {
        Scanner f = new Scanner(System.in);

        System.out.printf("Введите длину массива: ");

        Integer len = f.nextInt();

        System.out.printf("Введите число для массива: ");

        Integer initialValue = f.nextInt();

        int[] result = ArrayLen(len, initialValue);

        System.out.println(Arrays.toString(result));

        f.close();
    }

    private static int[] ArrayLen(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;

    }


}