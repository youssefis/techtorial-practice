package object;

public class MethodPractice2 {

    // create a method that will take two double numbers and an operation name
    // this method will return the result
    // *operation --> addition or multiplication

    public double twoOperation(double num1, double num2,String operationType){
        double result=0.0;
        if (operationType.equalsIgnoreCase("multiplication")){
            result=num1*num2;

        }else if (operationType.equalsIgnoreCase("addition")) {
            result = num1 + num2;
        }
        else {
            System.out.println("not supported "+result);
        }
        return result;
    }

    public static void main(String[]args){

        MethodPractice2 object=new MethodPractice2();
        double multi1= object.twoOperation(5,5,"multiplication");
        double multi2=object.twoOperation(21,5,"addition");
         //double multi3=object.twoOperation(21,5,"additin");
        System.out.println(multi1);
        System.out.println(multi2);
        //System.out.println(multi3);

        System.out.println("==================");

        int age= object.ageCalculator(1997,2022);
        object.ageCalculator(1997);
    }

    // create a method that will find out your age
    // return and print the age

    public int ageCalculator(int yearOfBirth, int currentYear){
        int age=currentYear-yearOfBirth;
        System.out.println("your age is "+ age);
        return age;
    }
    public int ageCalculator(int yearOfBirth){
        int age=2022-yearOfBirth;
        System.out.println("your age is "+ age);
        return age;
    }



}
