package ru.alexn.gb;

public class Person_5 {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public Person_5(String fio,String position,String email,String phone,float salary,int age) {
        this.fio=fio;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;

    }
    public  void printInfo()
    {
        System.out.println("Ф.И.О  "+fio);
        System.out.println("Должность: "+position);
        System.out.println("e-mail: "+email);
        System.out.println("Номер телефона: "+phone);
        System.out.println("Зарплата:  "+salary);
        System.out.println("Возраст: "+age);


    }

    public int getAge() {
        return age;
    }
}
