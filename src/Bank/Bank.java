package Bank;

import Customer.AccountHolder;

import java.util.List;

public abstract class Bank {

    protected String holder;
    protected String accountType;
    protected String SSN;
    protected double initialDeposit;
    protected String accountNumber;
    protected double currentBalance;
    protected List<AccountHolder> accountHolders;

    public Bank(String holder, String accountType, String SSN, double initialDeposit) {
        this.holder = holder;
        this.accountType = accountType;
        this.SSN = SSN;
        this.initialDeposit = initialDeposit;
    }

    void deposit(double amount) {
        currentBalance += amount;
        System.out.println("your new balance = " + currentBalance);
    }

    boolean withdrawal(double amount) {
        if (amount < currentBalance) {
            System.out.println("insufficient funds in your account");
            return false;
        } else {
            currentBalance -= amount;
            return true;
        }
    }

    boolean transfer(double amount, String accountHolder) {
        if ((currentBalance > amount) && findAccount(accountHolder)) {
            System.out.println(amount + " successfully transferred to " + accountHolder);
            return true;
        }
        return false;
    }


    public void showInfo() {

        System.out.println("ACCOUNT HOLDER : " + holder);
        System.out.println("ACCOUNT TYPE : " + accountType);
        System.out.println("ACCOUNT NUMBER : " + accountNumber);
        System.out.println("INITIAL DEPOSIT : " + initialDeposit);
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
