package oop.inheritance1;

public class DomesticAnimal extends Animal{

    boolean hasToy;
    protected void play(){
        System.out.println(name+" is playing");

    }

    int jump(){
        System.out.println("D is Jumping");
        return 7;
    }
    public DomesticAnimal hunt(){
        System.out.println("D is Hunting ");
        return new DomesticAnimal();
    }

}
