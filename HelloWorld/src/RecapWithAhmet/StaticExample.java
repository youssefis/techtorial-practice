package RecapWithAhmet;

public class StaticExample {

    public static int money=1000;
    int weight=155;

    public static void speak(){
        System.out.println("Ahmet is speaking");

    }

    public void run(){
        System.out.println("Ahmet is running");
    }

    public void widrawlMoney(){
        money-=100;
        System.out.println("You have "+money+" left on your account");
    }

    static {
        //no matter what this block
        //will execute first
        System.out.println("Hey i'm a static block");
    }
    {
        //this is an instance block
        System.out.println("I'm an instance block");
    }




}
