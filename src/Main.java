public class Main {

    //Задача 1

    private static void opredelitVisokosny(double year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }

    }
    //Задача 2

    private static void opredelitDevice(int year, int OC) {
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

    private static int opredelitDelivery(int distance) {
        int dostavka = 0;
        if (distance > 20) {
            if (distance > 60) {
                dostavka = 3;
            } else {
                dostavka = 2;
            }
        } else {
            dostavka = 1;
        }
        return dostavka;
    }

    public static void main(String[] args) {
        //Задача 1

        opredelitVisokosny(2004);

        //Задача 2

        opredelitDevice(2021, 0);

        //Задача 3

        System.out.println("Доставка займёт " + opredelitDelivery(21) + " дня");
    }
}