package Bank;

public class Savings extends Bank {

    private static final int ACC_DIGIT = 1;
    private static int value = 0;


    //initialise the account number in the constructor
    public Savings(String holder, String accountType, String SSN, double initialDeposit) {
        super(holder, accountType, SSN, initialDeposit);
        value++;


    }
    //creates account number by taking the ACC_DIGIT, 5-digit unique number, last 2-digits of SSN and random 3 digits
    private String createAccNumber(){

        String accountType = "2";
        char lastSSN = SSN.charAt(10);
        char secondLastSSN = SSN.charAt(9);
        String uniqueNumber = String.format("%05d",value);

        int[] intArray = new int[3];
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 3; i++){
            int rand = (int) (Math.random() * range) + min;
            intArray[i] = rand;
        }

        return accountType + lastSSN + secondLastSSN + uniqueNumber;
    }
}
