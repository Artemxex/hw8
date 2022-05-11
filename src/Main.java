public class Main {

    //Задача 1

    public static double Visok(double year) {
        if (year % 4 == 0) {
            System.out.println(year + " - високосный год");
        } else System.out.println(year + " - не високосный год");
        return 0;
    }
    //Задача 2

    public static int Device(int year, int OC) {
        int currentYear = 2022;
        if (OC == 0) {
            if (year < currentYear)
                System.out.println("Установите lite версию приложения для Android по ссылке");
            else System.out.println("Установите lite приложения для Android по ссылке");

        } else if (year >= currentYear) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        return 0;
    }
    //Задача 3

    public static int Delivery(int distance) {
        if (distance > 20) {
            if (distance > 60) System.out.println("Потребуется 3 дня для доставки");
            else System.out.println("Потребуется 2 дня для доставки");
        } else System.out.println("Потребуется 1 день для доставки");
        return 0;
    }

    public static void main(String[] args) {
        //Задача 1

        Visok(2012);

        //Задача 2

        Device(2021, 0);

        //Задача 3

        Delivery(24);
    }
}