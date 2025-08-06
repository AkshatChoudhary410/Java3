package com.hdfc.bank.models;

public class PersonalLoan extends Loan {
    private String purpose;

    public PersonalLoan(int loanId, String customerName, double loanAmount, String purpose) {
        super(loanId, customerName, loanAmount);
        this.purpose = purpose;
    }

    @Override
    public double calculateEMI() {
        return (loanAmount * 0.07) + loanAmount;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println(" Type: PersonalLoan | EMI: " + calculateEMI());
    }

    public void applyInsurance(double amount) {
        System.out.println("Insurance applied with amount: " + amount);
    }
}