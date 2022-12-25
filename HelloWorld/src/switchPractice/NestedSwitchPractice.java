package switchPractice;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        /*
        1- IT department
            -John
            -Marry
        2- Accounting
            -Jake
        3- HR
            -Ana
            -Diana
            -Mike
        4- Help desk
            -EFE
         */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of the department you reaching out to " +
                "\n1- IT department \n2- Accounting  \n3- HR \n4- Help desk ");
        int department=input.nextInt();

        switch (department){
            case 1 :
                System.out.println("This is IT department ");
                    System.out.println("Do you want to talk to john/marry ");
                    input.nextLine();
                    String ItDepartment= input.nextLine().toUpperCase();
                    switch (ItDepartment){
                        case "JOHN":
                            System.out.println("This is "+ItDepartment); break;
                        case "MARRY":
                            System.out.println("This is "+ItDepartment);break;
                    }break;
            case 2 :
                System.out.println("This is Jake from Accounting");break;

            case 3 :
                System.out.println("This is HR");
                System.out.println("Do you want to talk to Ana/diana/mike");
                input.nextLine();
                String HR=input.nextLine().toUpperCase();

                    switch (HR){
                        case "ANA":
                            System.out.println("This is "+HR);break;
                        case "DIANA":
                            System.out.println("This is "+HR);break;
                        case "MIKE":
                            System.out.println("This is "+HR);break;

                    }break;
            case 4:
                System.out.println("This is EFE fom Help Desk");

        }
    }
}
