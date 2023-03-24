package RecapWithAhmet.OOP;

public abstract class AbstractPractice1 {

    public static String name;

//    public static void run(){ // you can have regular method
//
//        System.out.println("Hello I am running");
//
//    }

    public AbstractPractice1() {
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void dismiss(); // abstract method does not have body
    public abstract void speak();

}
