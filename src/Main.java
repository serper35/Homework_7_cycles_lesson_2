public  class Main {

    public static void main (String [] args) {
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
        int money = 0;
        int moneyNeed = 2_459_000;
        int moneyPerMonth = 15000;
        int month = 0;
        System.out.println("Задача №1");

        while (money < moneyNeed) {
            money += moneyPerMonth;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей.");
        }
    }

    public static void task2() {
        int number = 0;
        int number_10 = 10;
        System.out.println("\nЗадача №2");

        while (number < number_10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = number; i >= 1; i--) {
            System.out.print(i  + " ");
        }
    }

    public static void task3() {
        int population = 12_000_000;
        int birthRate = 17;
        int death = 8;
        int averagePeople = 1000;
        int year = 0;
        int year_10 = 10;
        int difference;
        System.out.println("\nЗадача №3");

        while (year < year_10) {
            difference = (population / averagePeople * birthRate) - (population / averagePeople * death);
            population += difference;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек(а)");
        }
    }

    public static void task4() {
        double totaLMoney = 0;
        int moneyPerMonth = 15000;
        double penny = 1.07;
        int moneyNeed = 12_000_000;
        int month = 0;
        System.out.println("\nЗадача №4");

        while (totaLMoney < moneyNeed) {
            totaLMoney = (totaLMoney + moneyPerMonth) * penny;
            month++;
            String result = String.format("%.3f",totaLMoney);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + result + " рублей.");
        }
    }

    public static void task5() {
        double totaLMoney = 0;
        int moneyPerMonth = 15000;
        double penny = 1.07;
        int moneyNeed = 12_000_000;
        int month = 0;
        System.out.println("\nЗадача №5");

        while (totaLMoney < moneyNeed) {
            totaLMoney = (totaLMoney + moneyPerMonth) * penny;
            month++;
            String result = String.format("%.3f", totaLMoney);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + result + " рублей.");
            }
        }
    }

    public static void task6() {
        double totaLMoney = 0;
        int moneyPerMonth = 15000;
        double penny = 1.07;
        int years = 9;
        int yearToMonth = years * 12;
        int month = 0;
        System.out.println("\nЗадача №6");

        while (month < yearToMonth) {
            totaLMoney = (totaLMoney + moneyPerMonth) * penny;
            month++;
            String result = String.format("%.3f", totaLMoney);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + result + " рублей.");
            }
        }
    }

    public static void task7() {
        int friday = 4;
        int month = 31;
        int today = 1;
        System.out.println("\nЗадача №7");

        while (today < month) {
            if (today % friday == 0) {
                System.out.println("Сегодня пятница, " + today + "-е число. Необходимо подготовить отчет.");
                friday += 7;
            }
            today++;
        }
    }

    public static void task8() {
        int cometYear = 79;
        int currentYear = 2023;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        System.out.println("\nЗадача №8");

        for (int i = pastYear; i <= futureYear; i++ ) {
            if (i % 79 == 0) {
                System.out.println("Комета пролетала (пролетит) в " + i + " году.");
            }
        }
    }
}