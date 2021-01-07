package com.ATMMachine;

import java.text.DecimalFormat;

public class Account {
    private int customerNumber, PIN;
    private double SavingBalance, checkingBalance;

    DecimalFormat format = new DecimalFormat("'$'###,##0.00");

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public double getSavingBalance() {
        return SavingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.SavingBalance = savingBalance;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void savingWithdraw(int amount) {
        if (amount > getSavingBalance()) {
            System.out.println("Balance cannot be negative.");
        } else {
            setSavingBalance(getSavingBalance() - amount);
            System.out.println("Remaining balance: " + format.format(getSavingBalance()));
        }
    }

    public void savingDeposit(int amount) {
        if (amount < 0) {
            System.out.println("You cannot deposit a negative amount.");
        } else if (amount == 0) {
            System.out.println("Nothing added.");
        } else {
            setSavingBalance(getSavingBalance() + amount);
            System.out.println("New balance: " + format.format(getSavingBalance()));
        }
    }

    public void checkingWithdraw(int amount) {
        if (amount > getCheckingBalance()) {
            System.out.println("Balance cannot be negative.");
        } else {
            setCheckingBalance(getCheckingBalance() - amount);
            System.out.println("Remaining balance: " + format.format(getCheckingBalance()));
        }
    }

    public void checkingDeposit(int amount) {
        if (amount < 0) {
            System.out.println("You cannot deposit a negative amount.");
        } else if (amount == 0) {
            System.out.println("Nothing added.");
        } else {
            setCheckingBalance(getCheckingBalance() + amount);
            System.out.println("New balance: " + format.format(getCheckingBalance()));
        }
    }
}
