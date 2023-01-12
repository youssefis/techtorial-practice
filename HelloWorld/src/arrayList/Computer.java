package arrayList;

import java.util.ArrayList;

public class Computer {
    /*
    Create a Computer class under Arraylist package
    -have instance fields of:
	brand, price, color, screenSize
    -create one constructor to initialize all instance variables
    Create a Test class
    -store 4 computer objects in an arraylist
    -show properties of each computer from the list
     */
    String brand;
    double price;
    String color;
    double screenSize;

    public Computer(String brand,double price, String color, double screenSize ){

        this.brand=brand;
        this.price=price;
        this.color=color;
        this.screenSize=screenSize;

    }
    public String toString(){
        return "Computer > "+brand+" - "+price+" - "+color+" - "+screenSize;
    }
    ArrayList <Computer> newList=new ArrayList<>();
    public ArrayList<Computer>filter1(ArrayList<Computer>givenList){
        for (int i=0;i<givenList.size();i++){

            if(givenList.get(i).price>1200&&givenList.get(i).screenSize>13.5){
                newList.add(givenList.get(i));
            }

        }
        return newList;
    }

}
