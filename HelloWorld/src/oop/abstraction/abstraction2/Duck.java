package oop.abstraction.abstraction2;

public class Duck extends Animal implements CanSwim, CanFly{

    public void fly() {
        System.out.println("Duck is in the air");
    }


    public void landing(double speed) {
        System.out.println("Duck is landing on the water");
    }


    public Integer swim(int deep) {
        System.out.println("Duck is in the water");

        return 10;
    }
}
