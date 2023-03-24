package oop.encapsulation;

public class CityTest {

    public static void main(String[] args) {
        City city=new City();

        city.setPopulation(223334);
        System.out.println(city.getPopulation());
        city.setName("Chicago");
        System.out.println(city.getName());
        city.setZipCode(60656);
        System.out.println(city.getZipCode());
        city.setCapital(false);
        System.out.println(city.isCapital());;
    }

}
