package primitives;

public class CompoundAssignments {
    public static void main(String[] args) {
        int cars=2;

        System.out.println(cars);
        cars=cars+1;
        System.out.println(cars+" number of cars after first purchase");
        cars+=1;
        System.out.println(cars+" number of cars after second purchase");
        // selling a car
        cars-=1; //cars=cars-1;
        System.out.println(cars+" after selling one car");
        // sharing cars with another person
        cars/=2;
        System.out.println(cars+" after sharing single car");
    }
}
