package object;

public class Cat {

    String name; //declare an instance variable
    String color;
    int age =4;
    int foodAmount = 20; // declare and initialise an instance method
    // create a method that will print "Tom is sleeping"
    // use this method in the test class

    public void sleeping (){

        System.out.println(name+" is sleeping");
    }

    // create a run method that will return an integer number
    // that is indicating how many miles user run

    public int run(){
        System.out.println(name+ " is running");
        return 3;
    }

    //create a method that will return a string value -->
    // "..Tom is walking to destination..."
    // destination should come from parameter

    public String walk(String destination){

        return name+" is walking to "+destination ;

    }
    // create a method that will initialize color of the cat

    public void setColor(String color1){
        color=color1;
    }
    // create a method that will return color of cat

    public String getColor(){
        return color;
    }

    // create a method that will print and return all properties of cat

    public String allProperties(){
        System.out.println("++++"+name+"-"+color+"-"+ age +"-"+foodAmount+"++++");
        return  name+"-"+color+"-"+ age +"-"+foodAmount;
    }

    // set the age of cat, get the age of cat by using method
    // once you use method to get age of cat print out
    // in 10 years your age will be

    public void setAge(int age1){
        age =age1;
    }
    public int getAge(){
        return age;
    }



}
