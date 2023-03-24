package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice5 {

    public static void main(String[] args) {

        StringBuilder[] builders={new StringBuilder("code"),new StringBuilder("fish"),new StringBuilder("interview"),new StringBuilder("mock")};

        System.out.println(reversEveryWord(builders));

    }


    // {"code", "fish", "interview","mock","is","coming","soon"}
    // return as list {"edoc","hsif",...}

    public static List <String> reversEveryWord(StringBuilder[]builders){

    List<String> list=new ArrayList();
        for (StringBuilder builder:builders){
            String str="";
            for (int i=builder.length()-1;i>=0;i--){

                str=str.concat(""+builder.charAt(i));

            }
            list.add(str);

        }
    return list;
    }

}
