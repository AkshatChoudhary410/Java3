package com.hdfc.bank.models;

public class HomeLoan extends Loan {
    private String propertyAddress;

    public HomeLoan(int loanId, String customerName, double loanAmount, String propertyAddress) {
        super(loanId, customerName, loanAmount);
        this.propertyAddress = propertyAddress;
    }

    @Override
    public double calculateEMI() {
        return ((loanAmount * 0.10) + loanAmount)/12;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println(" Type: HomeLoan | EMI: " + calculateEMI());
    }

    public void applyInsurance(String insurer) {
        System.out.println("Insurance applied with: " + insurer);
    }
}