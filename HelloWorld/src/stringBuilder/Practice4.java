package stringBuilder;


import java.util.Arrays;

public class Practice4 {
    // create a method that will take  StringBuilder object
    // and this method will delete '*' from given parameter

    // "t*he i*nt******er***vi*ew *is *coming*"


    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("t*he i*nt******er***vi*ew *is *coming*");
        starsDeleter(builder);


        StringBuilder[] builders={new StringBuilder("code"), new StringBuilder("fish"), new StringBuilder("interview")};

        replaceIs(builders);

    }


    static public void starsDeleter(StringBuilder builder ){

        for (int i=0 ;i<builder.length();i++){
            if (builder.charAt(i)=='*') {
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);

    }

    // {"code", "fish", "interview","mock","is","coming","soon"}
    // replace every char 'i' with '-' from given stringBuilder
    //array of strings
    // solve it by creating  a method and pass the array as a parameter

    public static void replaceIs(StringBuilder[] builder){

        for (int i = 0; i<builder.length; i++){

            for (int j=0;j<builder[i].length();j++){
                if (builder[i].charAt(j)=='i'){
                    builder[i].replace(builder[i].indexOf("i"),builder[i].indexOf("i")+1,"-");
                }
            }
            System.out.println(builder[i]);
        }


    }





}


