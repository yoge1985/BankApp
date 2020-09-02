package BankApp;

import Bank.Debit;
import Bank.Savings;

public class BankAccountApp {

    //app does the following:
    //
    //reads a .csv file of names, social security numbers, account type and initial deposit
    //type of account: savings and debit
    //both types have following method: deposit(), withdrawal, transfer(), showInfo().
    //both have 11-digit acc. no. (1 for savings, 2 for checking), last 2 digits of ssn, unique 5 digit and random
    //3 digit.
    //savings - safety deposit box, identified by 3 -digit number and accessed by 4-digit code
    //debit - debit card with 12-digit number and 4-digit PIN.
    //both will use Interface to determine the base Rate
    //savings will be .25 of base rate
    //debit will be 15% of base rate
    //show info will display relevant info as well as specific to either checking or savings.


    public static void main(String[] args) {

        Savings savings = new Savings("joe","01234556455",200);
        Debit debit = new Debit("bill","11223344555",400);
        Debit debit1 = new Debit("ray","33221155665",230);

        savings.createAccNumber();
        savings.showInfo();
        debit.createAccNumber();
        debit.showInfo();
        debit1.createAccNumber();
        debit1.showInfo();



    }
}
