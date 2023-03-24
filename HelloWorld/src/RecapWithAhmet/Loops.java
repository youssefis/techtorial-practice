package RecapWithAhmet;

import java.util.Scanner;

public class Loops {

    /*
    Possible Interview questions:
        1-MANY technical and automation questions are required the loops

        Types of loops
            1- Do while --> no matter what it will run the code once
            2- while --> it will check the condition first and run the code
            based on that
            3- For --> it initialize variable, condition and Pre-post Increment(i++,i--)
            4- ForEach -> it will access all data in the storage. (Iterate one by one)
     */
    public static void main(String[]args){
//        String username;
//        do {
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Please enter your username");
//            username=scanner.nextLine();
//            System.out.println(username);
//        }while (username.startsWith("A"));

        // While --> 1- ask the user to put an int number and reverse the int number
                        // by using while loop and String
                        // 2- Multiply the digits
                        // Exp : 12345 --> 1st OUTPUT=54321 --> 2end OUTPUT -> 120

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Please enter an integer");
//        int number=scanner.nextInt();
//        String revers="";
//        int total=1;
//        while (number!=0){
//            int digit=number%10;
//            revers+=digit;
//            total*=digit;
//            number/=10;
//        }
//        System.out.println(revers);
//        System.out.println(total);


        /*
          HOMEWORK:
      USING SCANNER: Ask user to enter one string value with 3 words
      1-Print first letter of Each Word
      2-Print last letter of each Word
      3-Print the total index of first letters
      4-Print the sum of the last letter of each word's index number
      5-Print the difference between total last index and total first index

      CLUES:I would use if condition for charAt and ' '

      EXAMPLE:"Ahmet Loves Java"
      //output:ALJ
      //output:tsa
      //output:18
      //output:29
      //output:11

      NOTE:YOu can use either one or two loops.
     */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter one string value with 3 words");
        String str= scanner.nextLine().trim();
        String FirstLetters="";
        String LastLetters="";
        int totalIndexOfFirstLetters=0;
        int totalIndexOfLastLetters=0;
        String [] words = str.split(" ");
        for (int i=0;i<=words.length-1;i++){


            String word=words[i];

            FirstLetters+=word.charAt(0);
            LastLetters+=word.charAt(word.length()-1);
            totalIndexOfFirstLetters+=str.indexOf(word.charAt(0));
            totalIndexOfLastLetters+=str.lastIndexOf(word.charAt(word.length()-1));




        }
        System.out.println("FirstLetters: "+FirstLetters);
        System.out.println("LastLetters: "+LastLetters);
        System.out.println("totalIndexOfFirstLetters: "+totalIndexOfFirstLetters);
        System.out.println("totalIndexOfLastLetters: "+totalIndexOfLastLetters);
        System.out.println("output5: "+(totalIndexOfLastLetters-totalIndexOfFirstLetters));

    //Ahmet Loves Java
    }



}
