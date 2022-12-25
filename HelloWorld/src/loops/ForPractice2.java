package loops;

public class ForPractice2 {
    public static void main(String[] args) {

       /* int sum=0;
        for (int num1=10, num2=15;num1<=num2 ;num1++){

            sum=sum+num1;

        }
        System.out.println("sum is "+ sum);
        */

        // print out every letter from this given string separated by comma
        String str= "Today is beautiful";
        str= str.replace(" ","");

        /*
        for (int i=0 ;i<str.length() ;i++ ){

            if (i==str.length()-1){

                System.out.println(str.charAt(i));

            }else {
                System.out.print(str.charAt(i)+", ");
            }

        }

         */

        // print above style without spaces --> get rid of spaces and put dash instead of comma

        for ( int i1=0;i1<str.length() ;i1++ ) {

            if (i1 == str.length() - 1) {

                System.out.println(str.charAt(i1));
            } else {
                System.out.print(str.charAt(i1) + "-");

            }

        }

        }
}
