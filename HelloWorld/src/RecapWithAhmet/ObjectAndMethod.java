package RecapWithAhmet;

public class ObjectAndMethod {

    /*
    Possible Interview questions:
        1-what do you know about Object? and tell me a couple methods of it?
             Always go general to Deep!
        --> Object is a representation of the class( blueprint )
        --> there are some useful methods of object that i use to perform
            som actions in my project like:
            *> .equals : to do a comparison between two objects
            *> toString: I use it to make the data into String format(Arrays.toString)
            *> Hashcode: it gives the location of the data

        2-what is the difference between object and class?
            Class : is a template fo creating objects, a class contains fields and methods
            to manipulate objects, a class contains constructors which are used to create objects,
             Object: is an instance of a class (Instance=Object)
             Class: it is declared with class keyword
             object: it is declared with new keyword

        3-How do you initialize the instance variables
            as far as I know there are three ways to initialize an instance variable:
                - in the declaration: int age=25
                - in the constructor: public Person(int age) { this.age = age; }
                - In a method setMethod: public void setAge(int age) { this.age = age; }

        4-What is the difference between local and instance variable?
            * Instance Variable:
                -Belongs to class
                -it has default values (null, 0,0, 0, false)
                -it can have access modifiers (public, private, protected, default)

            * Local variable:
                -It belongs to the class
                -It has no default values
                -It has no access modifiers

     */
    String name="Youssef";
    int age=25;
    String eyColor="Black";
    String nationality;

    public ObjectAndMethod(String name, int age, String eyColor, String nationality) {
        this.name = name;
        this.age = age;
        this.eyColor = eyColor;
        this.nationality = nationality;
    }
    public void run(int speed){
        int number=1; //local variables cannot have default values
        // public int number ->you can not use access modifiers for local variables

        System.out.println(number);
        System.out.println(speed);
    }

    public static void main(String[]args){

        ObjectAndMethod maleHuman=new ObjectAndMethod("Youssef",25,"Black","Moroccan"); //object --> representation of class
                                                         //Instance of Class
        System.out.println(maleHuman.age);//25
        maleHuman.age=26;
        System.out.println(maleHuman.age);//26
        System.out.println(maleHuman.nationality);//null
        maleHuman.nationality="Moroccan";
        System.out.println(maleHuman.nationality); //moroccan
//      System.out.println(maleHuman.number); // there is no direct call variable


    }

}
