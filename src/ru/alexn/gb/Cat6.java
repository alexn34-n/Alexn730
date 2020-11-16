package ru.alexn.gb;

public class Cat6 extends Animal6
{
    Cat6(String name,String color,int age,int run)
    {
        super(name, color, age,run);
    }

    @Override
    void run() {
        System.out.println(name+ " пробежад"+ run+" м");
    }
}
