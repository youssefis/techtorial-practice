package oop.inheritance3;

public class Car extends Vehicle{

    String model,engineType;


    public Car() {
        super("Camry", 2023, "Toyota");
    }

    @Override
    public void move() {
        System.out.println("car is moving");
        super.move();
    }

    @Override
    protected Vehicle accelerate() {
        System.out.println("Car is accelerating");
        // return (Car) (new vehicle (---,5,---))
        System.out.println(super.model);
        this.model=super.model;
        System.out.println(model);
        return  new Vehicle ("---",5,"---");
    }

    public static void main(String[] args) {

        Vehicle vehicle= new Vehicle("Y",2023,"Tesla");
        vehicle.move();
        vehicle.accelerate();
        System.out.println("=======================");
        Car car=new Car();
        car.move();
        System.out.println("======================");
        car.accelerate();
        Vehicle v=car.accelerate();
        System.out.println(v);
        System.out.println(v.model);
        System.out.println(v.year);



    }


}
