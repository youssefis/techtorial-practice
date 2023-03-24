package oop.encapsulation;

public class CoffeeTask {
    /*
    ===Task===
		create a coffee class
		have 3 instance variables as private
		create setters and getters to give access to those variables
		in a different class, try to access instance
		variables to initialize or manipulate
     */

    private String flavor;
    private int size;
    private double cost;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
