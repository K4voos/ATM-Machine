package com.ATMMachine;

import java.text.DecimalFormat;

public class Account {
    private int customerNumber, PIN;
    private double SavingBalance, checkingBalance;

    DecimalFormat format = new DecimalFormat("'$'###,##0.00"); //todo add Locale.US

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
}
