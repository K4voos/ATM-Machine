package com.ATMMachine;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;
import java.util.InputMismatchException;

public class OperationController extends ATMMenu {

    //todo operations need more description and confirmation
    //todo all the messages must come over a prompt window

    @FXML
    private Button depoBTN;
    @FXML
    private Button withdrawBTN;
    @FXML
    private Button logOutBTN;
    @FXML
    private Label alertText;
    @FXML
    private Button transferBTN;
    @FXML
    private Button changeAccBTN;
    @FXML
    private Button viewBalanceBTn;
    @FXML
    private TextField amountFIELD;
    private double amount;

    public void depoOnClick() {

        try {
            amount = Double.parseDouble(amountFIELD.getText());
        } catch (NumberFormatException | InputMismatchException e) {
            amount = 0;
            errorMessage("Please enter a positive amount"); //todo change color of amountFIELD temporarily
        }

        if (GetAccountController.accountType.equals("Saving")) {
            savingDeposit(amount);
        } else {
            checkingDeposit(amount);
        }
    }

    public void withdrawOnClick() {

        try {
            amount = Double.parseDouble(amountFIELD.getText());
        } catch (NumberFormatException | InputMismatchException e) {
            amount = 0;
            errorMessage("Please enter a positive amount"); //todo change color of amountFIELD temporarily
        }

        if (GetAccountController.accountType.equals("Saving")) {
            savingWithdraw(amount);
        } else {
            checkingWithdraw(amount);
        }
    }

    public void logOutOnClick() throws IOException {

        Main.changeScene("/LogIn.fxml");
    }

    public void transferOnClick() {
        alertText.setText("Unfortunately this option is not available now");
    }

    public void changeAccOnClick() throws IOException {

        Main.changeScene("/GetAccount.fxml");
    }

    public void viewBalanceOnClick() {

        if (GetAccountController.accountType.equals("Saving")) {
            successMessage("You have " + format.format(getSavingBalance()) +
                    " in your Saving Account.");
        } else {
            successMessage("You have " + format.format(getCheckingBalance()) +
                    " in your Checking Account.");
        }
    }

    public void savingWithdraw(double amount) {

        if (amount > getSavingBalance()) {
            errorMessage("Balance cannot be negative.");
        } else if (amount == 0) {
            errorMessage("Please enter a positive amount");
        } else {
            setSavingBalance(getSavingBalance() - amount);
            successMessage("Remaining balance: " + format.format(getSavingBalance()));
        }
    }

    public void savingDeposit(double amount) {

        if (amount < 0) {
            errorMessage("You cannot deposit a negative amount.");
        } else if (amount == 0) {
            successMessage("Nothing added");
        } else {
            setSavingBalance(getSavingBalance() + amount);
            successMessage("New balance: " + format.format(getSavingBalance()));
        }
    }

    public void checkingWithdraw(double amount) {

        if (amount > getCheckingBalance()) {
            errorMessage("Balance cannot be negative.");
        } else if (amount == 0) {
            errorMessage("Please enter a positive amount");
        } else {
            setCheckingBalance(getCheckingBalance() - amount);
            successMessage("Remaining balance: " + format.format(getCheckingBalance()));
        }
    }

    public void checkingDeposit(double amount) {
        if (amount < 0) {
            errorMessage("You cannot deposit a negative amount.");
        } else if (amount == 0) {
            successMessage("Nothing added");
        } else {
            setCheckingBalance(getCheckingBalance() + amount);
            successMessage("New balance: " + format.format(getCheckingBalance()));
        }
    }

    public void errorMessage(String text) {

        alertText.setTextFill(Color.RED);
        alertText.setFont(new Font("Arial", 12));
        alertText.setText(text);
    }

    public void successMessage(String text) {

        alertText.setTextFill(Color.DARKGREEN);
        alertText.setFont(new Font("Arial", 16));
        alertText.setText(text);
    }
}
