package BankApp;

import Bank.Debit;

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

        Debit debit = new Debit("joe","debit","1234567894",200);
        Debit debit1 = new Debit("brad","debit","0011223345",400);
        Debit debit2 = new Debit("tim","debit","9876543210",128);

        debit.showInfo();
        System.out.println("=================");
        debit1.showInfo();
        System.out.println("==================");
        debit2.showInfo();


    }
}
