package object;

public class BankAccountTest1 {

    public static void main(String args[]){

        BankAccount account=new BankAccount();
        account.accountHolderName="ahmad";
        account.displayInfo();
        account.deposit(1000000);
        account.withdraw(750000);
        account.userName="abc";
        account.password="efg";
        account.login("abc","efg");
        account.signUp("usef","userusef","123",201239);
        account.displayInfo();

        BankAccount java1=new BankAccount();
        System.out.println(java1.isLoggedIn);
        java1.displayInfo();
        java1.signUp("yossfe","yossf12","yyssff",232990);
        java1.login("yossf12","yyssff");



    }

}
