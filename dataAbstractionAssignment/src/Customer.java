import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    Random random = new Random();

    Customer(){
        this.accountNumber = random.nextInt(1000);
        this.name = "John";
        checkBalance = 0;
        savingBalance = 0;
        deposit(100.0, CHECKING);
        deposit(100.0, SAVING);
    }
    Customer(String name, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = random.nextInt(1000);
        checkBalance = 0;
        savingBalance = 0;
        deposit(checkDeposit, CHECKING);
        deposit(savingDeposit, SAVING);
    }

    //Requires: double, String
    //Modifies: this, deposits
    //Effects: adds deposit amount to specified account
    public void deposit(double amt, String account){
        Date date = new Date();
        Deposit deposit = new Deposit(amt, date, account);
        deposits.add(deposit);
        if (account.equals(CHECKING)) {
            checkBalance += amt;
        }
        else {
            savingBalance += amt;
        }
    }

    //Requires: double, String
    //Modifies: this, withdraws
    //Effects: withdraws from specified account if amt < account balance
    public void withdraw(double amt, String account){
        Date date = new Date();
        if (checkOverdraft(amt, account)){
            Withdraw withdraw = new Withdraw(amt, date, account);
            withdraws.add(withdraw);
            if (account.equals(CHECKING)) {
                checkBalance -= amt;
            }
            else {
                savingBalance -= amt;
            }
        }
        else {
            System.out.println("Withdraw amount exceeds account balance.");
        }
    }

    private boolean checkOverdraft(double amt, String account){
        if (account.equals(CHECKING)){
            return amt <= checkBalance;
        }
        else if (account.equals(SAVING)) {
            return amt <= savingBalance;
        }
        else{
         return false;
        }
    }

    public double getCheckBalance(){
        return checkBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
