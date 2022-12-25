package loops;

public class ForPractice4 {
    public static void main(String[] args) {
        String str="It is a cloudy day in Chicago";
        // print out >> " I found a lower case 'c' "
        // when you see a lower case 'c'
        int c=0,c1=0;
        for (int i=0; i<str.length();i++){

            if (str.charAt(i)=='c'){
                c++;
                System.out.println(" I found a lower case 'c'");
            }
            if (i<str.length()&&str.charAt(i)=='i'){
                c1++;
            }


        }
        System.out.println(" I found "+ c + " lower case 'c'");
        System.out.println(" I found "+ c1 + " 'i'");
    }
}
