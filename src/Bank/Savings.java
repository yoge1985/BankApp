package Bank;

public class Savings extends Bank {

    private static final int ACC_DIGIT = 1;
    private static int value = 0;


    //initialise the account number in the constructor
    public Savings(String holderDetail, String SSNumber, double initialAmount) {
        holder = holderDetail;
        SSN = SSNumber;
        accountType = "1";
        deposit(initialAmount);
        value++;


    }

}
