package ru.alexn.gb;
//created by Alexey Nikolaev

public class Hometask8lesson1 {
    public  static void printIfYearIsLeapOrNot(int year)
    {
        if(year%4==0&&year%100 !=0)
        {
            System.out.println(year+"год является високостным.");
        }
        else  if (year%400==0)
        {
            System.out.println(year+"год является високостным.");
        }
        else  {
            System.out.println(year+"год является невисокостным.");
        }
    }
}
