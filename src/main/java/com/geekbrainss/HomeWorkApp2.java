package com.geekbrainss;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        doOne(20, 30);
        doTwo(-5);
        doThree(10);
        doFour("Вино");
    }
    public static boolean doOne(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    public static void doTwo(int a) {
        if  (a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean doThree(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void doFour(String a) {
        int b;
        for (b = 0; b < 5; b++) {
            System.out.println("a = " + a);}
    }
    public static void doFive() {

    }
}
