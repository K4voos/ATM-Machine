package com.ATMMachine;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMMenu extends Account {
    Scanner sc = new Scanner(System.in);

    int userInput = 0;
    HashMap<Integer, Integer> data = new HashMap<>(); //customer number and pin number respectively
    HashMap<Integer, String> names = new HashMap<>();

    public void getLogin(int customerNumber, int PINNumber) throws IOException {
        int x = 1;
        data.put(123456, 123);
        data.put(987654, 987);
        names.put(123456, "Jafar");
        names.put(987654, "Majid");

        System.out.println("Welcome to ATM Project");
        //do {
            /*try {
                System.out.println("Enter your customer number: ");
                setCustomerNumber(sc.nextInt());

                System.out.println("Enter your PIN number: ");
                setPIN(sc.nextInt());
            } catch (Exception e) {
                System.out.println("\nInvalid characters. Only numbers are allowed.\n");
                x = 2;
            }*/

            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == customerNumber && entry.getValue() == PINNumber) {
                    Main.changeScene("/GetAccount.fxml");

                    // this for loop is to find customer name and welcome them
                    /*for (Map.Entry<Integer, String> name : names.entrySet()) {
                        if (name.getKey().equals(entry.getKey())) {
                            //todo welcome user in account screen
                            LogInController.setAlertText("Welcome dear" + entry.getValue());

                        }
                    }*/
                } 
            }

            //todo check what happens if customer and PIN number are wrong
            //System.out.println("Wrong customer or PIN number.");
        //} while (x == 1);

    }

    private void getAccountType() {
        System.out.println();
        System.out.println("Select the account you want to access: ");
        System.out.println("Type 1. Saving Account");
        System.out.println("Type 2. Checking Account");
        System.out.println("Type 3. Exit");
        System.out.println("Choice: ");
        userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                getSaving();
                break;
            case 2:
                getChecking();
                break;
            case 3:
                System.out.println("Thank you and have a good time.");
                /*try {
                    getLogin();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                break;
            default:
                System.out.println("Invalid choice.");
                getAccountType();
        }
    }

    private void getSaving() {
        System.out.println();
        System.out.println("Saving Account:");
        System.out.println("Type 1. View Balance");
        System.out.println("Type 2. Withdraw Funds");
        System.out.println("Type 3. Deposit Funds");
        System.out.println("Type 4. Return to previous menu");
        System.out.println("Type 5. Exit");
        System.out.println("Choice:");
        userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Your saving account has " +
                        format.format(getSavingBalance()));
                System.out.println("Do you have any further question?");
                getSaving();
                break;
            case 2:
                System.out.print("Amount you want to withdraw from your saving account: ");
                savingWithdraw(sc.nextInt());
                System.out.println("Do you have any further question?");
                getSaving();
                break;
            case 3:
                System.out.print("Amount you want to deposit into your saving account: ");
                savingDeposit(sc.nextInt());
                System.out.println("Do you have any further question?");
                getSaving();
                break;
            case 4:
                getAccountType();
                break;
            case 5:
                System.out.println("Thank you and have a good time.");
                /*try {
                    getLogin();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            default:
                System.out.println("Invalid choice.");
                getSaving();
        }
    }

    private void getChecking() {
        System.out.println();
        System.out.println("Checking Account:");
        System.out.println("Type 1. View Balance");
        System.out.println("Type 2. Withdraw Funds");
        System.out.println("Type 3. Deposit Funds");
        System.out.println("Type 4. return to previous menu");
        System.out.println("Type 5. Exit");
        System.out.println("Choice:");
        userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Your checking account has " +
                        format.format(getCheckingBalance()));
                System.out.println("Do you have any further question?");
                getChecking();
                break;
            case 2:
                System.out.print("Amount you want to withdraw from your checking account: ");
                checkingWithdraw(sc.nextInt());
                System.out.println("Do you have any further question?");
                getChecking();
                break;
            case 3:
                System.out.print("Amount you want to deposit into your checking account: ");
                checkingDeposit(sc.nextInt());
                System.out.println("Do you have any further question?");
                getChecking();
                break;
            case 4:
                getAccountType();
                break;
            case 5:
                System.out.println("Thank you and have a good time.");
                /*try {
                    getLogin();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
                break;
            default:
                System.out.println("Invalid choice.");
                getChecking();
        }
    }
}
