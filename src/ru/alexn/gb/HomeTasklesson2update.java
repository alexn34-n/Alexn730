package ru.alexn.gb;
// Created by  Alexey Nikolaev


import java.util.Arrays;

public class HomeTasklesson2update {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        int[] array = {1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(array));
        changeZeroesAndOnes1(array);
        System.out.println(Arrays.toString(array));

        System.out.println("Task2.");
        int[] emptyArray = new int[8];
        System.out.println(Arrays.toString(emptyArray));
        fillArrayWithProgression(emptyArray);
        System.out.println(Arrays.toString(emptyArray));

        System.out.println("Task3.");
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(myArray));
        multiplyOnSixIn(myArray);
        System.out.println(Arrays.toString(myArray));

        System.out.println("Task 4.");
        int[][] square = new int[10][10];
        System.out.println("With zeroes");
        printSquare(square);

        fillDiagonalsWithOnes(square);
        System.out.println("With one.");
        printSquare(square);

        System.out.println("Task5.");
        int[] minMaxArray = {1, 2, 7, 4, 8};
        System.out.println(Arrays.toString(minMaxArray));
        printMinAndMax(minMaxArray);

        System.out.println("Task6.");
        int[] sumsArray = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sumsArray));
       // boolean  isBalanced = hasBalance(sumsArray);
        //System.out.println("Суммы правой и левой части где либо равны " + isBalanced);

        System.out.println("Task7.");

        int[] rightShiftArray = {1, 2, 3, 4, 5, 6,7};
        System.out.println(Arrays.toString(rightShiftArray));
        shiftArray(rightShiftArray, 3);
        System.out.println(Arrays.toString(rightShiftArray));

        int[] leftShiftArray = {1, 2, 3, 4, 5, 6,7,8};
        System.out.println(Arrays.toString(leftShiftArray));
        shiftArray(leftShiftArray, -5);
        System.out.println(Arrays.toString(leftShiftArray));

    }


    static void changeZeroesAndOnes1(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            //inputArray[i]=(inputArray[i]==1)?0:1;
            inputArray[i] = 1 - inputArray[i];
        }
    }

    static void fillArrayWithProgression(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = i * 3;
        }
    }

    static void multiplyOnSixIn ( int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
        }
    }
    static void fillDiagonalsWithOnes ( int[][] square)
    {
        for (int i = 0; i < square.length; i++) {
            square[i][i]=1;
            square[i][square[i].length - 1 - i] = 1;
        }
    }
    static void printSquare(int[][] inputSquare){
    for (int i = 0; i < inputSquare.length; i++) {
        System.out.println(Arrays.toString(inputSquare[i]));
       }
   }

    static void printMinAndMax (int[] inputArray)
    {
        int min = inputArray[0];
        int max = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {
            if (min > inputArray[i]) {
                min = inputArray[i];
            }
            if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }
        System.out.println("Mininum: " + min);
        System.out.println("Maxnum: " + max);
    }
/*
   static void  hasBalance(int[] inputArray)
   {
    int leftSum=0;
    for (int i = 0; i < inputArray.length; i++) {
        leftSum += inputArray[i];

        int rightSum = 0;
        for (int j = (i + 1); j < inputArray.length; j++) {
            rightSum += inputArray[j];
        }
        if (leftSum == rightSum)
        {
            return true;
        }
    }
          return false;
        }

 */

    static void shiftArray(int[] array,int shift)
    {
        if (isNegative(shift)) {
            for (int i = 0; i > shift; i--)
            {
                leftShift(array);
            }
        } else
        {
            for (int i = 0; i <shift; i--)
            {
                rightShift(array);
            }
        }
    }
    static void rightShift(int[] inputArray) {
        int buffer = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];

        for (int j = 1; j < (inputArray.length - 1); j++) {
            inputArray[inputArray.length - j] = inputArray[inputArray.length - j - 1];
        }
        inputArray[1] = buffer;
    }
    static void leftShift(int[] inputArray) {
        int buffer = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[0];

        for (int j = 1; j < (inputArray.length - 1); j++) {
            inputArray[j - 1] = inputArray[j];
        }
        inputArray[inputArray.length - 2] = buffer;
    }
    static  boolean isNegative(int number)
    {
        return number<0;

    }

}



