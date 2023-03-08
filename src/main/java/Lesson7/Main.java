package Lesson7;

public class Main {

    public static void main(String[] args) {

        Plate plate = new Plate(550);
        Cat Simba = new Cat("Симба", 150);
        Cat Kuzya = new Cat("Кузя", 200);

        while (true) {

            System.out.println(plate);
            System.out.println(Simba);
            System.out.println(Kuzya);

            Simba.eat(plate);
            Kuzya.eat(plate);

            Simba.makeHungry();
            Kuzya.makeHungry();
            plate.increaseFood(300);

            if (plate == null) {
                break;
            }
        }
        }

    }

