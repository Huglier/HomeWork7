public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {

        System.out.println("Задача 1");

        int contribution = 15000;
        int month = 0;
        int accumulation = 0;
        while (accumulation < 2460000) {
            accumulation = accumulation + contribution;
            month = month + 1;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation);
    }

    public static void task2() {

        System.out.println("Задача 2");

        int number = 1;
        while (number < 11) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println(" ");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void task3() {

        System.out.println("Задача 3");

        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i < 11; i++) {
            population = population + (population / 1000 * fertility) - (population / 1000 * mortality);
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    public static void task4() {

        System.out.println("Задача 4");

        int accumulation = 15000;
        int percent = 7;
        int month = 1;
        while (accumulation < 12_000_000) {
            accumulation = accumulation + accumulation * percent / 100;
            System.out.println("Месяц " + month + ", накопление равно: " + accumulation);
            month = month + 1;

        }

    }

    public static void task5() {

        System.out.println("Задача 5");

        int accumulation = 15000;
        int percent = 7;
        int month = 0;
        while (accumulation < 12_000_000) {
            accumulation = accumulation + accumulation * percent / 100;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопление равно: " + accumulation);
            }
        }

    }

    public static void task6() {

        System.out.println("Задача 6");

        int accumulation = 15000;
        int percent = 7;
        for (int i = 0; i < 109; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", накопление равно: " + accumulation);
            }
            accumulation = accumulation + accumulation * percent / 100;
        }

    }

    public static void task7() {

        System.out.println("Задача 7");

        int date = 3;
        for (; date <= 31; ) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            date = date + 7;
        }

    }

    public static void task8() {

        System.out.println("Задача 8");

        int date = 2023;
        int dateAfter = date + 100;
        int dateBefor = date - 200;
        for (int i = 0; i < 2123; i = i + 79) {
            if (dateAfter >= i && dateBefor <= i) {
                System.out.println("Год пролета коменты: " + i);
            }
        }
    }
}