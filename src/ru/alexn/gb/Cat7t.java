package ru.alexn.gb;

public class Cat7t
{
    private  String name;
    private int appetite;
    private boolean hungry;


    public Cat7t(String name,int appetite)
    {
        this.appetite=appetite;
        this.name=name;
        this.hungry=true;
    }

    void infoDate(){
        String isHungry =! hungry ? "сыт":"голоден";
        System.out.println(name+":"+isHungry);
    }

    public  void  eat(Plate7t plate7t)
    {
        plate7t.decreaseFood(appetite);
        hungry=false;
    }
}
