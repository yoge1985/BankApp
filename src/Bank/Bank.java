package Bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Bank {

    protected String accountType;
    protected String accountNumber;
    private double currentBalance;
    protected String holder;
    protected String SSN;
    protected int value;
    protected static List<Bank> accounts = new ArrayList<Bank>();

    public Bank() {

        accounts.add(this);
    }


    void deposit(double amount) {

        currentBalance = amount;

    }

    boolean withdrawal(double amount) {
        if (currentBalance > amount){
            currentBalance -= amount;
            return true;
        }else {
            System.out.println("insufficient funds");
            return false;
        }
    }
    boolean transfer(double amount, String accHolder) {
        if ((currentBalance > amount) && findAccount(accHolder)){
            System.out.println(amount + " successfully transferred to " + accHolder);
            return true;
        }
        System.out.println("transaction could not be made");
        return false;
    }
    //account number is made up of Acc. type + last 2 digits of SSN + unique 5-digit + random 3-digit
    public String createAccNumber(){

        char lastSSN = SSN.charAt(10);
        char secondLastSSN = SSN.charAt(9);
        String uniqueNumber = String.format("%05d",value);

        int[] intArray = new int[3];
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int rand;
        for (int i = 0; i < 3; i++){
            rand = (int) (Math.random() * range) + min;
            intArray[i] = rand;
        }

         accountNumber = accountType + secondLastSSN + lastSSN + uniqueNumber + intArray[0] +
         intArray[1] + intArray[2];
        return accountNumber;

    }


    public void showInfo() {

        System.out.println("ACCOUNT HOLDER : " + holder);
        System.out.println("ACCOUNT TYPE : " + accountType);
        System.out.println("ACCOUNT NUMBER : " + accountNumber);
        System.out.println("CURRENT BALANCE: " + currentBalance);
        System.out.println("SSN: " + SSN);
        System.out.println("=================================");
    }

    protected boolean findAccount(String accountHolder) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).holder.equals(accountHolder)) {
                return true;
            }
        }
        return false;
    }

    public  void showList(){
        for (int i = 0; i < this.accounts.size(); i++){
            System.out.println(accounts.get(i));
        }
    }

    @Override
    public String toString() {
        return holder + " -->" + accountNumber;
    }
}
