public class Main {

    //Задача 1

    private static void visok(double year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

    }
    //Задача 2

    private static void device(int year, int OC) {
        int currentYear = 2022;
        if (OC == 0) {
            if (year < currentYear) {
                System.out.println("Установите lite версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите lite приложения для Android по ссылке");
            }

        } else if (year >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

    }
    //Задача 3

    private static int delivery(int distance) {
        if (distance > 20) {
            if (distance > 60) {
                System.out.println("Потребуется 3 дня для доставки");
            } else {
                System.out.println("Потребуется 2 дня для доставки");
            }
        } else {
            System.out.println("Потребуется 1 день для доставки");
        }
        return 0;
    }

    public static void main(String[] args) {
        //Задача 1

        visok(2004);

        //Задача 2

        device(2021, 0);

        //Задача 3

        delivery(24);
    }
}