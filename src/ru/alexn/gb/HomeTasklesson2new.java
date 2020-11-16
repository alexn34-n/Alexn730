package ru.alexn.gb;
//Created by Alexey Nikolaev

public class HomeTasklesson2new {

    //public static void main(String[] args) {
    //Решение 1 задачи
    public static void invertArray() {
        int[] table1 = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < table1.length; i++) {
            System.out.print("Cтарый массив;  " + table1[i]);
            int[] table2 = {0, 1, 0, 1, 1, 0};
            for (int j = 0; j < table2.length; j++) {
                System.out.print("Новый массив:  " + table2[j]);
            }
        }
    }

    // Решение 2задачи
    public static void fillArray() {
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
            System.out.print(arr2[i]);
        }
    }

    //Решение 3 задачи
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = i * 2;
                System.out.print(w[i]);
            }
        }
    }


    //Решение 4 задачи
    public static void fiiDiagonal() {
        int task[][] = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 0, 1}};
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++)
                System.out.print(task[i][j] + " ");
            System.out.println();
        }
    }


    //Решение 5 задачи
    public static void maxMinArray() {
        int wer[] = {23, 78, 54, 104, 34, 12};
        int i, max, min;
        min = max = wer[0];
        for (i = 1; i < wer.length; i++) {
            if (wer[i] < min) min = wer[i];
            if (wer[i] > max) max = wer[i];
        }
        System.out.println("min+max: " + min + " " + max);
    }



    //Решение 6 задачи
    public static  void checkBalance() {
        int sym[] = new int[6];
        sym[0] = 2;
        sym[1] = 3;
        sym[2] = 4;
        sym[3] = 3;
        sym[4] = 0;
        sym[5] = 6;
        int i, syml, symr;
        syml = sym[0] + sym[1] + sym[2];
        symr = sym[3] + sym[4] + sym[5];

        if (syml == syml) {
            System.out.print("Массив сбалансирован");
        } else {
            System.out.print("Массив несбалансирован");
        }

    }
    //Решение 7 задачи
    public static void shiftArray () {
        int[] shift = new int[5];
        int n = 1;
        for (int i = 0; i < shift.length; i++) {
            shift[i] = i + n;
            System.out.println("shift[" + i + "]=" + shift[i]);
        }
    }



}



