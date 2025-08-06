package com.hdfc.bank.main;

import com.hdfc.bank.models.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Loan[] loans = {
                new HomeLoan(101, "Shriraj |", 11500, "Mumbai"),
                new PersonalLoan(102, "Raj |", 10500, "Wedding")
        };

        for (Loan loan : loans) {
            loan.printDetails();
//            System.out.println("EMI: " + loan.calculateEMI());
            System.out.println();
        }

        // toString explicit
//        System.out.println(loans[0].toString());
    }
}