package oop.abstraction.abstraction2;

public interface CanFly {

    int TAIL = 1;
    int WING = 2;

    void fly();
    void  landing(double speed);

    // all methods and variables are public, static, and abstract

    public default void printInfo(){
        System.out.println(this.TAIL+" --  "+ this.WING);
    }

    private void abcd(){
        System.out.println("++++++++++");
    }

}
