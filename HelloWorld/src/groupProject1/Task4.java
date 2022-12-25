package groupProject1;

public class Task4 {
    public static void main(String[] args) {
        int minute=3456789;
        int years=minute/(60*24*365);
        int days=((minute/(60*24))-(6*365));
        System.out.println(minute+" minutes is approximately "+years+" years"+" "+days+" days");

    }
}
