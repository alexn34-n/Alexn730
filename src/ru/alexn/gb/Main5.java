package ru.alexn.gb;

public class Main5 {
    public static void main(String[] args)
    {
        Person_5[] person_5s=new Person_5[5];
        person_5s[0]=new Person_5("John Smith","Director","122@hotmai.com","111234",100000,45);
        person_5s[1]=new Person_5("Don Jonhson","Web-programmer","123@hotmai.com","122233",90000,38);
        person_5s[2]=new Person_5("Mike Right","Java-programmer","124@hotmai.com","122341",80000,35);
        person_5s[3]=new Person_5("James Martinson","Phython-programmer","125@hotmai.com","234445",70000,41);
        person_5s[4]=new Person_5("Helen Robson","Web-desigher","126@hotmai.com","112237",60000,25);

        person_5s[0].printInfo();
        person_5s[1].printInfo();
        person_5s[2].printInfo();
        person_5s[3].printInfo();
        person_5s[4].printInfo();

        for(int i=0;i< person_5s.length;i++)
        {
            if(person_5s[i].getAge()>40) {
                person_5s[i].printInfo();
            }
        }

    }
}
