package arrayList;

import object.BankAccount;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {

        ArrayList<Computer> computers=new ArrayList<>();
        Computer c1=new Computer("Deel",1400,"Black",15.5);
        Computer c2=new Computer("Acer",899,"Black",13.5);
        Computer c3=new Computer("Apple",1500,"Black",11.5);
        Computer c4=new Computer("Asus",1300,"Black",17.5);
        computers.add(c1);
        computers.add(c2);
        computers.add(c3);
        computers.add(c4);
        System.out.println(computers);
        //find computers that are less than $1000
        for (Computer item:computers){
            if (item.price<1000){
                System.out.println(item.brand+" - "+item.price+" - "+item.color);
            }
        }
        System.out.println("--------------");
        for (int i=0;i<computers.size();i++){
            if (computers.get(i).price<1000){
                System.out.println(computers.get(i).brand+" - "+computers.get(i).price+" - "+computers.get(i).color);
            }
        }

        //create a method that will get an arrayList as a parameter
        //this method will find out computers that cost over 1200
        //and screenSize over 13.5
        //and that method should store return those computers as a new arrayList

        Computer computer=new Computer("samsung",1000,"red",13.3);
        System.out.println(computer.filter1(computers));

        // find out and tell me the total prices of computers so i can figure out if
        // i am able to buy the bulk
        // create a method to solve this task
        System.out.println("********************");
        Double totalCost=totalPrice(computers);
        System.out.println(totalCost);
        System.out.println("********************");
        BankAccount account=new BankAccount();
        account.withdraw(totalCost);




    }
    public static Double totalPrice(ArrayList<Computer>list2){
        Double total=0.0;
        for (Computer device:list2){
            total=total+device.price;
        }
    return total;
    }
}
