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
                month = month +1;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + accumulation);
    }
        public static void task2() {

        System.out.println("Задача 2");

        int number = 1;
        int amount = 0;
        while (amount < 10){

            System.out.print(number+" ");
            amount = number++;
        }
        System.out.println(" ");
        for (int i = 10; i>0; i--){
            System.out.print(i+" ");

        }System.out.println();
        }
        public static void task3() {

            System.out.println("Задача 3");

            int population = 12_000_000;
            int fertility = population/1000*17;
            int mortality = population/1000*8;
            for (int i = 1;i<11;i++){

                System.out.println("Год "+i+" численность населения составляет "+population);
                population = population + fertility - mortality;
            }

        }
        public static void task4() {

            System.out.println("Задача 4");

            int accumulation = 15000;
            int percent = 7;
            int total = 0;
            int month = 1;
            while (total<12_020_000) {
                System.out.println("Месяц " + month + ", накопление равно: " + total);
                total = total + accumulation * percent / 100 + accumulation;
                month = month + 1;

            }

        }
        public static void task5(){

            System.out.println("Задача 5");

            int accumulation = 15000;
            int percent = 7;
            int total = 0;
            int month = 1;
            while (total<12_020_000) {

                total = total + accumulation * percent / 100 + accumulation;
                month = month + 1;
                if (month % 6 ==0) {System.out.println("Месяц " + month + ", накопление равно: " + total);
                }
            }

        }
        public static void task6() {

            System.out.println("Задача 6");

            int accumulation = 15000;
            int percent = 7;
            int total = 0;
            for (int i = 0;i<109;i++){
                if (i % 6 ==0) {System.out.println("Месяц " + i+ ", накопление равно: " + total);
                }
                total = total + accumulation;
            }

        }
        public static void task7() {

            System.out.println("Задача 7");

            int date = 4;
            for(int i = 0;i<5;i++){
                if(date<32) {
                    System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
                    date = date + 7;
                }
            }

        }
        public static void task8() {

            System.out.println("Задача 8");

            int date = 2023;
            int dateAfter = date + 100;
            int dateBefor = date - 200;
            for (int i = 0; i < 100000; i = i + 79) {
                if (dateBefor < i || dateAfter < i) {
                    if (dateBefor > i || dateAfter > i) {
                        System.out.println("Год пролета коменты: " + i);
                    }
                }
            }
        }
}