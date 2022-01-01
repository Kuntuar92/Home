package com.geekbrainss;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        /*int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for(int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
                System.out.println(array[i]);
            } else if (array[i] == 1) {
                array[i] = 0;
            System.out.println(array[i]);
            }
        }*/

        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        /*int[] array1 = new int[100];

        for (int i = 0; i < array1.length; i++){
            array1[i]=i+1;
            System.out.println(array1[i]);
        }*/

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        /*int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i < array2.length; i++) {
            if(array2[i] < 6){
                int sum = array2[i]*2;
                System.out.println(sum);}
        }*/

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        /*int[][] array3 = new int[5][5];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[0].length; j++){
                array3[i][j] = (i == j || j == (array3[i][j] - i - 1))? 1 : (int)(Math.random()*100);
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }*/

        /*5
        int[] array = retLenArr(5, 10);*/

        //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        /*int[] array5 = {1, 2, 3, 5, 8, 7, 92, -2};
        int min, max;
        min = max = array5[0];
        for (int i = 0; i < array5.length; i++){
            if(array5[i] < min){
                min = array5[i];
            }  if(array5[i] > max){
                max = array5[i];
            }
        }
        System.out.println("min is: " + min + "; max is: " + max);*/

        //7.

    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    /*public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.println("Длина равна: " + arr[i]);
        }
        return arr;
    }*/
}