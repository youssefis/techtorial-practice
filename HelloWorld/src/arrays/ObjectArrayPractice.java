package arrays;

import java.util.Objects;
import java.util.Scanner;

public class ObjectArrayPractice {
    public static void main(String[] args) {

        String str=new String("Test");
        int num1=9;
        boolean bl1=true;
        double d1=9.8;
        Scanner sc=new Scanner(System.in);

        Object[] example={str,num1,bl1,d1,sc};
        for (Object ex:example){
            System.out.println(ex.toString().charAt(0));
        }
    }
}
