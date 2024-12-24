import java.time.LocalDate;

public class Main {

    public static void isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный.");
        } else {
            System.out.println("Год " + year + " не високосный.");
        }
    }

    public static void printVersion(int typeOS, int year) {
        int currentYear = LocalDate.now().getYear();
        String os = "";
        if (typeOS == 1) {
            os = "android";
        } else {
            os = "IOS";
        }
        if (year < currentYear && typeOS == 1) {
            System.out.println("Установите облегченную версию для " + os + " по ссылке.");
        } else if (year < currentYear && typeOS == 0) {
            System.out.println("Установите облегченную версию для " + os + " по ссылке.");
        } else if (typeOS == 1) {
            System.out.println("Установите обычную версию для " + os + " по ссылке.");
        } else {
            System.out.println("Установите обычную версию для " + os + " по ссылке.");
        }
    }

    public static String deliveryDay(int deliveryDistance) {
        int days = 1;

        if (deliveryDistance <= 20) {
            return " Потребуется " + days + " дня.";
        } else if (deliveryDistance <= 60) {
            return " Потребуется " + (++days) + " дня.";
        } else if (deliveryDistance <= 100) {
            return " Потребуется " + days + 2 + " дня.";
        } else {
            throw new RuntimeException(" Доставки нет.");
        }

    }


    public static void main(String[] args) {

        System.out.println("Task 1");
        isLeapYear(2024);
        System.out.println(" Task 2");
        printVersion(0, 2015);
        System.out.println("Task 3");
        String box = deliveryDay(120);
        System.out.println(box);
    }


}