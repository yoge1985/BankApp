package Bank;

public abstract class Bank {

    protected String holder;
    protected String accountType;
    protected String SSN;
    protected double initialDeposit;
    protected String accountNumber;

    public Bank(String holder, String accountType, String SSN, double initialDeposit) {
        this.holder = holder;
        this.accountType = accountType;
        this.SSN = SSN;
        this.initialDeposit = initialDeposit;
    }

    void deposit(double amount){

    }

    void withdrawal(double amount){

    }

    void transfer(double amount, String accountName){

    }
    public void showInfo(){

    }
}
