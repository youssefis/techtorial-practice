package loops;

public class Task1 {
    public static void main(String[] args) {

        // String str1=" job",str2=" Happy ",str3="Sun ",str4=" Dream Job!";
        String[] str={" job"," Happy ","Sun "," Dream Job!"};
        String[]reversedArray=new String[str.length];

        for (int i=0;i<str.length;i++){
            String reversed="";
            for (int k=str[i].length()-1;k>=0;k--){

                reversed+=str[i].charAt(k);


            }
            reversedArray[i]=reversed;
            System.out.println(str[i]+"->"+reversed);
        }






    }

}
