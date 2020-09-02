package Customer;

public class AccountHolder {

    private String name;
    private String SSN;
    private String accountType;
    private double currentBalance;
    private double initialDeposit;

    public AccountHolder(String name, String SSN, String accountType, double initialDeposit) {
        this.name = name;
        this.SSN = SSN;
        this.accountType = accountType;
        this.initialDeposit = initialDeposit;
        this.currentBalance = initialDeposit;

    }

    public String getName() {
        return name;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }
}
