package object;

public class BankAccount {
    /*
    New Class: BankAccount
        variables:
        -accountHolderName*, bankName*, balance*, userName*, password*, isLoggedIn
        Methods:
        - void displayInfo() ->will print out all account information
        - double deposit() -> one parameter to update balance
        - double withdraw() -> one parameter to update balance
        -void logIn() -> userName, password parameters to update isLoggedIn boolean.

     */
    String accountHolderName,bankName,userName,password;
    double balance;
    boolean isLoggedIn;

    public void displayInfo(){
        if (isLoggedIn){
            System.out.println("accountHolderName: "+ accountHolderName +"\nbankName: "+bankName+"\n balance: "+balance+"\nisLoggedIn: "+isLoggedIn);
        }else {
            System.out.println("you should log in to see your info");
        }
    }

    public double deposit(double depositAmount){
        balance+=depositAmount;
        System.out.println("Your balance after deposit of "+depositAmount+" is $"+balance);
        return balance;

    }

    public double withdraw(double withdrawAmount){
        balance-=withdrawAmount;
        System.out.println("Your balance after withdraw of "+withdrawAmount+" is $"+balance);
        return balance;

    }

    public void login(String user,String pass){
        if (user.equals(userName) && pass.equals(password)){
            System.out.println("You are successfully logged in to your account");
            isLoggedIn=true;
            System.out.println("information after log in");
            displayInfo();
        }else {
            isLoggedIn=false;
            System.out.println("Please check username or password");
        }
    }

    // create a method that will initialize instance fields
    // void signUp();

    public void signUp(String accountHolderName1,String userName1,String password1,double balance1){
          accountHolderName=accountHolderName1;
          userName=userName1;
          password=password1;
          balance=balance1;
        System.out.println("You are successfully signed up");


    }







}
