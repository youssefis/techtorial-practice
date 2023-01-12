package arrays;

public class MultidimensionalPractice4 {
    public static void main(String[] args) {

        String[][] menu = { {"steak","pasta","fries"} , {"olivie","cesar"} ,{"ice cream","cake","candy","pie"} };

        for(int page=0;page< menu.length;page++){

            for (int items=0;items<menu[page].length;items++){
                System.out.println(menu[page][items]);
                if(menu[page][items].equalsIgnoreCase("pasta")) {
                    System.out.println("i need one of " + menu[page][items]);
                }
            }


        }
        System.out.println("==============================");

        for (String page[]:menu){

            for (String item:page){
                System.out.println(item);
            }

        }




    }
}