package com.geekbrainss;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        drawSquare();
        checkHomework();
        howIsTheWeatherThere();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 20;
        if(a + b >= 0) {
            System.out.println("Сумма положительная");}
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 130;
        if(value <= 0) {
            System.out.println("Красный");
        } else if(value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if(value >= 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int c = 100;
        int d = 200;
        if(c >= d) {
            System.out.println("c >= d");
        } else {
            System.out.println("c < d");
        }
    }

    public static void drawSquare() {
        System.out.println("-----");
        System.out.println("| |");
        System.out.println("-----");
    }

    public static void checkHomework() {
        int tasksCount = 6;

        if (tasksCount == 6) {
            System.out.println("Великолепно, Вы выполнили все задачи!");
        }
        if (tasksCount > 3 && tasksCount < 6) {
            System.out.println("Отлично, Вы выполнили почти все задачи!");
        }
        if (tasksCount <= 3) {
            System.out.println("Вы решили меньше половины, но Вы все равно молодец, надо же с чего-то начинать!!");
        }

        System.out.println("Проверка завершена");
    }

    public static void howIsTheWeatherThere() {
        int temperature = 10;
        if (temperature > 10) {
            System.out.println("На улице очень даже тепло для марта месяца");
        } else if (temperature > -5) {
            System.out.println("Для марта самое то");
        } else {
            System.out.println("Там точно весна?");
        }
    }
}
