package RecapWithAhmet.OOP;

public class InheritancePractice {

    /*
    Possible interview Questions:
        1-What do you know about inheritance and how do you inherit two classes?
            -->inheritance is parent-child relationship between classes.
            -->in java we use the "Extends" keyword following by the parent class
                to make a connection.
        2-Why do you use inheritance in your project
            -->as I mention inheritance make the child class use the parent class
            which reduce the amount of code and make it simple and efficient.

     */

    public static void main(String[] args) {

        Porsche porsche=new Porsche();
        porsche.price=300000;
        System.out.println(porsche.price);
        System.out.println(porsche.tires);

        Bugatti bugatti=new Bugatti();
        bugatti.price=500000;
        System.out.println(bugatti.price);
        System.out.println(bugatti.tires);

    }


}
