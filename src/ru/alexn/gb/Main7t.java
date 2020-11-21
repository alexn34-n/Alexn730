package ru.alexn.gb;

public class Main7t {
    public static void main(String[] args) {
        Cat7t[]cat7ts={new Cat7t("Клаус",20),new Cat7t("Бандит",25),new Cat7t("Мурка",10),new Cat7t("Борис",20),new Cat7t("Феликс",15)};


        Plate7t plate7t=new Plate7t(120);


        for (Cat7t cat7t:cat7ts)

        {
            cat7t.eat(plate7t);
            cat7t.infoDate();
        }
    }
}
