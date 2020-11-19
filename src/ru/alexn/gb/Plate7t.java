package ru.alexn.gb;

public class Plate7t {

    public  int food;

    public Plate7t(int food)
    {
        this.food=food;
    }

   boolean  decreaseFood(int n)
    {
        int dicr=food-n;
        if(dicr<0) return false;

        this.food-=n;
        return true;
    }



    public  void infoDate()
    {
        System.out.println("Plate: "+ food);
    }
}
