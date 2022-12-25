package arrays;

public class Practice5 {
    public static void main(String[] args) {
        int[] ages= {21,23,27,27,23,27,30,35,34,18,38,19};
        // find the biggest age
        int biggest=ages[0];

        for (int i=0;i<ages.length;i++){

            if (ages[i]>biggest){

                biggest=ages[i];
            }
        }
        System.out.println(biggest);
    }
}
