package ru.alexn.gb;

public class Main6 {
    public static void main(String[] args)
    {
    Cat6 cat6=new Cat6("Мурка","Пестрая",8,200);
    Dog6 dog6=new Dog6("Шарик","Белый",1,250,10);
    Cat6 cat61=new Cat6("Дашка","Пестрая",5,250);
    Dog6 dog61=new Dog6("Дружок","Рыжий",4,350,20);

    Animal6[] home={cat6,cat61,dog6,dog61};

    for (int i=0;i< home.length;i++) {
        if (home[i] instanceof Dog6)
        {
            Dog6 p=(Dog6)home[i];
            p.swin();
        }

        home[i].run();
    }


    }
}
