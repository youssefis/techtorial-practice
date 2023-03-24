package accessModifier;

public class Animal {

    public String namePublic;
    protected int ageProtected;
    String colorDefault;
    private double weightPrivate;

    public double eatPublic(){
        System.out.println("EAT"+ weightPrivate);
    return weightPrivate;
    }

    protected void runProtected(){
        System.out.println("Run");
    }

    private void sleepPrivate(){
        System.out.println("SLEEP"+ weightPrivate);
    }

    void jumpDefault(){
        System.out.println("JUMP");
    }

}
