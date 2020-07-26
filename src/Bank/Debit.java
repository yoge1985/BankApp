package Bank;

import java.util.ArrayList;
import java.util.List;

public class Debit extends Bank {

    //create account number in the constructor
    private static final int ACC_DIGIT = 2;
    private int value = 0;
    private List<Double> transactions;
    private double currentBalance;


    public Debit(String holder, String accountType, String SSN, double initialDeposit) {
        super(holder, accountType, SSN, initialDeposit);
        value++;
        accountNumber = createAccNumber();
        transactions = new ArrayList<>();

    }
    //Account number consists of either 1 for savings or 2 for debit, last 2 digits of SSN, unique 5-digit,
    //random 3-digit
    private String createAccNumber(){

        String accountType = "2";
        char lastSSN = SSN.charAt(9);
        char secondLastSSN = SSN.charAt(8);
        String uniqueNumber = String.format("%05d",value);

        int[] intArray = new int[3];
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < 3; i++){
            int rand = (int) (Math.random() * range) + min;
            intArray[i] = rand;
        }

        return accountType + lastSSN + secondLastSSN + uniqueNumber + intArray[0] + intArray[1] + intArray[2];
    }

    public void transactions(){

        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }

}
