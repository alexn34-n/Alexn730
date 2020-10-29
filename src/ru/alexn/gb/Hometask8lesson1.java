package ru.alexn.gb;
//created by Alexey Nikolaev

public class Hometask8lesson1 {
    public static void main(String[] args) {
        double year = 2040;

        if (year % 4 == 0 && year%100 !=0) {
            System.out.println("Высокостный год " + (int)year);

        }else {
            System.out.println("Год невысокостный");
        }
    }
}
