package ru.alexn.gb;

public class Dog6 extends Animal6
{
    int swin;

    Dog6(String name,String color,int age,int run,int swin)
    {
        super(name, color, age,run);
        this.swin=swin;
    }

    @Override
    void run() {
        System.out.println(name+ " пробежал "+ run+" м");
    }

    void swin()
    {
        System.out.println(name+" проплыл  "+swin+ " м");
    }
}
