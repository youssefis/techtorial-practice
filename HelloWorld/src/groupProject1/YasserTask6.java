package groupProject1;

public class YasserTask6 {
    public static void main(String[] args) {
        double balance = 2.46, quarter, dime, nickel, penni;
        double money = balance; //2.36
        int q, d, n, p;
        quarter = balance / 0.25;
        q = (int) quarter;

        System.out.println(q);

        dime = balance % 0.25;
        dime = dime / 0.10;
        d = (int) dime;
        System.out.println(d);

        balance = balance * 100; //236
        balance = balance - (q * 25) - (d * 10);
        nickel = balance / 5;
        n = (int) nickel;
        System.out.println(n);

        penni = balance - (n * 5);
        p = (int) penni;
        System.out.println(p);

        System.out.println(money + " will make " + q + " quarters "
                + d + " dimes " + n + " nickel " + p + " penni ");
    }
}
