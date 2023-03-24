package RecapWithAhmet.OOP;

public class EncapsulationPractice {
    private String name="yusuf";
    private int age=25;
    private long creditCard=123456789;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.startsWith("y")) {
            this.name = name;
        }else System.out.println("I'm the boos");
    }

    public long getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}
