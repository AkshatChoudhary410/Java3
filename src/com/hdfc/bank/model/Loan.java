package com.hdfc.bank.models;

public abstract class Loan {
    protected final int loanId;
    protected String customerName;
    protected double loanAmount;
    public static final String BANK_NAME = "HDFC Life";

    public Loan(int loanId, String customerName, double loanAmount) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
    }

    public abstract double calculateEMI();

    public void printDetails() {
        System.out.print("Loan ID: " + loanId + " | Customer: " + customerName);
    }

    @Override
    public String toString() {
        return "Loan ID: " + loanId + " | Customer: " + customerName;
    }
}