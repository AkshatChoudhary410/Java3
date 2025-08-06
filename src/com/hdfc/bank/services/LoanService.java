package com.hdfc.bank.services;

import com.hdfc.bank.models.*;

public class LoanService {
    public void printEMIDetails(Loan loan) {
        loan.printDetails(); // dynamic dispatch

        if (loan instanceof HomeLoan homeLoan) {
            System.out.println("Property Address: " + homeLoan);
        } else if (loan instanceof PersonalLoan personalLoan) {
            System.out.println("Purpose: " + personalLoan);
        }
    }
}