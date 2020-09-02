package Bank;

import java.util.ArrayList;
import java.util.List;

public class Debit extends Bank {

    private int value = 0;
    private List<Double> transactions;
    private double currentBalance;


    public Debit(String name, String SSNumber, double initialAmount) {
        holder = name;
        SSN = SSNumber;
        accountType = "2";
        initialDeposit = initialAmount;
        transactions = new ArrayList<>();
        value++;

    }

    public void transactions(){

        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }

}
