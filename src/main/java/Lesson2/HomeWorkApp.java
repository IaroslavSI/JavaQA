package Lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(Ex1(10, 5));

        System.out.println();

        Ex2(-5);

        System.out.println();

        System.out.println(Ex3(10));

        System.out.println();

        Ex4("Добрый день!", 5);

        System.out.println();

        Ex5(2023);
    }

     private static boolean Ex1(int a, int b) {
        int s = a + b;
        if (s > 10 && s < 20) return true;
        else return false;
    }

     private static void Ex2(int a) {
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    private static boolean Ex3(int a) {
        if (a < 0) return true;
        return false;
    }

    private static void Ex4(String str,int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + str);
        }
    }

    private static void Ex5(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");
    }
}
