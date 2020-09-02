package Bank;

import Customer.AccountHolder;

import java.util.List;

public abstract class Bank {

    protected String accountType;
    protected String accountNumber;
    protected double initialDeposit;
    private int currentBalance;
    protected String holder;
    protected String SSN;
    protected int value = 1;

//    protected double currentBalance;
    protected List<AccountHolder> accountHolders;

//    public Bank() {
//        if (Savings){
//            accountType = 1;
//        }else {
//            accountType = 2;
//        }
//    }

    void deposit(double amount) {

    }

    boolean withdrawal(double amount) {
        return true;
    }
    boolean transfer(double amount, String accountHolder) {
        if ((currentBalance > amount) && findAccount(accountHolder)) {
            System.out.println(amount + " successfully transferred to " + accountHolder);
            return true;
        }
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
        System.out.println("INITIAL DEPOSIT : " + initialDeposit);
        System.out.println("SSN: " + SSN);
        System.out.println("=================================");
    }

    private boolean findAccount(String accountHolder) {
        for (int i = 0; i < accountHolders.size(); i++) {
            if (accountHolders.get(i).getName().equals(accountHolder)) {
                return true;
            }
        }
        return false;
    }
}
