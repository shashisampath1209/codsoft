import java.util.*;
class BankAccount{
    private int balance;
    public BankAccount(int initialAmount){
        this.balance = initialAmount;
    }
    public int balance(){
        return balance;
    }
    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit of " + amount + ".Rs was successfull");
        } else {
            System.out.println("Invalid entry!. Please try to give a number above 0");
        }
    }
    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            System.out.println("Withdraw successfull of Rs."+ amount +"/-");
            balance -= amount;
        } else {
            System.out.println("Invaid entry!!.Insuffucient balance or negative value entered");
        }
    }
}

class ATM{

    private BankAccount account; 
    public ATM(BankAccount account){
        this.account = account;
    }

    public void display(){
        System.out.println("Select Any One of the Below Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Leave");
        System.out.println();
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int option;
        do{
            display();
            option=sc.nextInt();
            switch (option){
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw : ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Your Current Account balance is : " + account.balance());
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thanks for working with SBI Bank! ");
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid entry!!. Enter only the given options");   
            }
        }while (option != 4);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(10000);
        ATM atm = new ATM(acc);
        System.out.println("Enter Your Account's PIN Number : ");
        String pin = sc.nextLine();
        if (pin.equals("1234")) {
            atm.run();
        } else {
            System.out.println("Incorrect pin");
        }
    }
}