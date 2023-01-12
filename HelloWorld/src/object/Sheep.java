package object;

public class Sheep {

    // Instance variables define object

    String name;
    int age;
    String bread="husky";
    static int food=20;



    public String speak(int numberOfWords){
        System.out.println("The Sheep is Speaking");
        setAge(numberOfWords);

    return "Here are the words "+numberOfWords;
    }


    public void feed(String foodType,int foodAmount){
        // if the foodType is x cost for each pound is 0.50
        // if the foodType is y cost for each pound is 0.10

        if (foodType.equalsIgnoreCase("x")){
            double number=.50*foodAmount;
        }else {
            double number=.10*foodAmount;
        }

        System.out.println(" sheep is eating ");
    }
    public void setAge(int age1){
        age=age1;
    }
    public void play(){
        System.out.println("sheep is playing");
        food-=1;
    }
    public static void bath(){
        System.out.println("Sheep is taking  a shower");
    }

    public static void main(String[] args) {
        Sheep sheep1=new Sheep();
         sheep1.name="chakira";
        System.out.println(sheep1.bread);
        System.out.println(sheep1.age);
        sheep1.setAge(1);
        System.out.println(sheep1.age);
        Sheep sheep2=new Sheep();
        System.out.println(sheep2.age);
        String str=sheep2.speak(7);
        System.out.println(sheep2.age);
        System.out.println(str);
        System.out.println(sheep2.food);
        sheep2.play();
        System.out.println(sheep2.food);
        sheep2.play();
        sheep1.play();
        sheep1.play();
        sheep1.play();
        sheep2.play();
        sheep1.play();
        sheep2.play();
        sheep1.play();
        System.out.println(sheep2.food);



    }




}
