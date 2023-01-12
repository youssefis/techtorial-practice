package object;

public class MethodPractice3 {

    // create a method that can take an array with some names of veggies
    //this method will generate a message for each veggie as
    //if the veggie name has the word green into it >> "This is the most favorite"
    //if the veggie does not have the word green into it >>"this is the least favorite"
    // make the method return the amount of either the most favorite or the least favorite
    //make the method static
    //test your method in another class

    public static int veggieFilter(String[]veggies){
        int mostFavorite=0;
        int leastFavorite=0;
        for (int i=0;i<veggies.length;i++){
            String name=veggies[i].toLowerCase();
            if (name.contains("green")){
                mostFavorite++;
                System.out.println(mostFavorite+" : "+veggies[i]+": This is the most favorite");
                //mostFavorite=mostFavorite+1;
            }else {
                leastFavorite++;
                System.out.println(veggies[i]+": this is the least favorite");
                //leastFavorite=leastFavorite+1;
            }

        }
        System.out.println("there are "+mostFavorite+" most favorite viggies");
        System.out.println("there are "+leastFavorite+" least favorite viggies");
        return mostFavorite;
    }
    // overLoad veggieFilter method to create e-mail address for each veggie
    // return those created e-mail addresses as an array

    public static String[] veggieFilter(String veggies[],int numberOfVeggies){

        String[] emails=new String[veggies.length];
        String str="";
        for (int i=0;i<veggies.length;i++){
            String gmail="@gmail.com";
            str=veggies[i]+gmail;
            emails[i]=str;
        }
        return emails;
    }







}
