package object;

public class Animal {
    String name;
    String color;
    int age;
    int energyLevel;
    String gender="Female";
    public void eat(){
        energyLevel=100;
        System.out.println("energyLevel is "+energyLevel+" after eating");
        System.out.println(name+" is eating");
    }
    public void allProperties(){
        System.out.println(name+"-"+color+"-"+age+"-"+gender);
    }

    public void run(){
        energyLevel=energyLevel-20;
        System.out.println("After running energy level of "+name+" is "+energyLevel);
    }

}
