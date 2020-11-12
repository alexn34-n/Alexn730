package ru.alexn.gb;


public class HTL5personNew {

    public String name;
    public String occupation;
    public String email;
    public int phone_number;
    public int salary;
    public int age;

    public HTL5personNew(String name, String occupation, String email, int phone_number, int salary, int age) {

        this.name = name;
        this.occupation = occupation;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;


    }
}

class MainHTL5personNew {
    public static void main(String[] args) {
        HTL5person HTL5Person1 = new HTL5person("John Smith", "Director", "sdf@hotmail.com", 123457, 100000, 45);
        HTL5person HTL5Person2 = new HTL5person("Don Jonhson", "Web-programmer", "sae@hotmail.com", 109874, 75000, 37);
        HTL5person HTL5Person3 = new HTL5person("Mike Right", "Java-programmer", "trw@hotmail.com", 345624, 70000, 42);
        HTL5person HTL5Person4 = new HTL5person("James Martinson", "Phython-programmer", "vaw@hotmail.com", 456714, 65000, 32);
        HTL5person HTL5Person5 = new HTL5person("Helen Robson", "Web-desigher", "art@hotmail.com", 321672, 60000, 47);

        System.out.println("Имя первого содрудника:" + HTL5Person1.name + " Должность:" + HTL5Person1.occupation + " Электронная почта:" + HTL5Person1.email + " Номер телефона:" + HTL5Person1.phone_number + " Оклад:" + HTL5Person1.salary + " Возраст:" + HTL5Person1.age + ".");
        System.out.println();

        System.out.println("Имя второго содрудника:" + HTL5Person2.name + " Должность:" + HTL5Person2.occupation + " Электронная почта:" + HTL5Person2.email + " Номер телефона:" + HTL5Person2.phone_number + " Оклад:" + HTL5Person2.salary + " Возраст:" + HTL5Person2.age + ".");
        System.out.println();

        System.out.println("Имя третьего содрудника:" + HTL5Person3.name + " Должность:" + HTL5Person3.occupation + " Электронная почта:" + HTL5Person3.email + " Номер телефона:" + HTL5Person3.phone_number + " Оклад:" + HTL5Person3.salary + " Возраст:" + HTL5Person3.age + ".");
        System.out.println();

        System.out.println("Имя четвертого содрудника:" + HTL5Person4.name + " Должность:" + HTL5Person4.occupation + " Электронная почта:" + HTL5Person4.email + " Номер телефона:" + HTL5Person4.phone_number + " Оклад:" + HTL5Person4.salary + " Возраст:" + HTL5Person4.age + ".");
        System.out.println();

        System.out.println("Имя пятого содрудника:" + HTL5Person5.name + " Должность:" + HTL5Person5.occupation + " Электронная почта:" + HTL5Person5.email + " Номер телефона:" + HTL5Person5.phone_number + " Оклад:" + HTL5Person5.salary + " Возраст:" + HTL5Person5.age + ".");
        System.out.println();


        HTL5person[] persArray = new HTL5person[5];
        persArray[0] = new HTL5person("Petrov Pavel", "Capitan", "Petr@mail.ru", 890001, 55000, 50);
        persArray[1] = new HTL5person("Smipnov Anton", "Chief-engineer", "Smirn@mail.ru", 456784, 50000, 45);
        persArray[2] = new HTL5person("Volkov Igor", "Sailor", "Vol@mail.ru", 788665, 30000, 25);
        persArray[3] = new HTL5person("Orlov Oleg", "Sailor", "Orl@mail.ru", 345689, 30000, 35);
        persArray[4] = new HTL5person("Novikov Ivan", "Boatman", "Boa@mail.ru", 786544, 35000, 55);

        for (HTL5person e:persArray) {
            if (e.age>=40) {
                System.out.println("Имена сотрудников:"+e.name);
            }


        }

    }
}

