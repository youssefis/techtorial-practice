package object;

import java.util.Random;

public class Student {
    int batchNumber;
    String firstName;
    String lastName;

    public void study(){
        int number=hourCreator();
        System.out.println(firstName+" studies for " + number + " hours");

    }

    public void sleep(){
        int number=hourCreator();
        System.out.println(firstName+" sleeps for " + number + " hours");

    }
    public int hourCreator(){
        Random random=new Random();
        int hour=random.nextInt(12);
        return hour;
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.study();
        student.firstName="youssef";
        student.study();
        student.sleep();
    }


}
