package object;


public class TestBottle {
    public void bottleSize(Bottle bottle){
        if (bottle.size>8){
            System.out.println("it is a large bottle");
        }else {
            System.out.println("it is a small bottle");
        }
    }


    public static void main(String[] args) {
        Bottle bottle1=new Bottle(7);
        Bottle bottle2=new Bottle(9);
        System.out.println(bottle1.liquidAmount);
        bottle1.usage(4);
        System.out.println(bottle1.liquidAmount);

        // create a method that will take the bottle object as parameter
        // this method will  find out  if the bottle's size is greater than 8 oz
        // or not
        // if it is greater than 8, should print "it is a large bottle"


        TestBottle object=new TestBottle();
        object.bottleSize(bottle1);
        object.bottleSize(bottle2);




    }


}
