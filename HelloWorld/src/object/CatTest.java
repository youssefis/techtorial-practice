package object;

public class CatTest {
    public static void main(String[] args) {
        Cat tom= new Cat();
        System.out.println(tom.name);
        tom.name="Tom";
        tom.color="Black";

        System.out.println(tom.foodAmount);
        tom.foodAmount=40;
        System.out.println(tom.foodAmount);
        tom.sleeping();
        Cat cat2= new Cat();
        cat2.sleeping();
        tom.run();
        int number = tom.run();
        System.out.println(number);//3
        System.out.println("===================");
        System.out.println(tom.run());
        // however miles tom runs give him $500 per mile
        System.out.println(tom.run()*500);
        String message1=tom.walk("home");
        System.out.println(message1);
        System.out.println(tom.walk("park"));

        // method with void return types cannot be called in sout
        // sout(tom.sleep());

        tom.setColor("Blue");
        System.out.println(tom.color);

        String color2= tom.getColor();
        System.out.println(color2);
        System.out.println("=====================");
        //tom.allProperties();
        String info=tom.allProperties();
        System.out.println(info);

        tom.setAge(12);

        System.out.println("in 10 years your age will be "+(tom.getAge()+10));





    }


}
