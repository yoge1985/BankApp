package Bank;

public class Debit extends Bank {

    public Debit(String name, String SSNumber, double initialAmount) {
        holder = name;
        SSN = SSNumber;
        accountType = "2";
        deposit(initialAmount);
        value++;
//        accounts.add(this);


    }

}
