package com.ATMMachine;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ATMMenu extends Account {

    static String alertMessage;
    static String nameMessage;

    HashMap<Integer, Integer> data = new HashMap<>(); //customer number and pin number respectively
    HashMap<Integer, String> names = new HashMap<>();

    public void getLogin(int customerNumber, int PINNumber) throws IOException {
        data.put(123456, 123);
        data.put(987654, 987);
        names.put(123456, "Jafar");
        names.put(987654, "Majid");

        System.out.println("Welcome to ATM Project");

            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == customerNumber && entry.getValue() == PINNumber) {
                    Main.changeScene("/GetAccount.fxml");

                    // this for loop is to find customer name and welcome them
                    for (Map.Entry<Integer, String> name : names.entrySet()) {
                        if (name.getKey().equals(entry.getKey())) {
                            //todo welcome user in account screen
                            nameMessage = "Logged in as: " + entry.getValue();
                            break;
                        }
                    }
                } else { //todo separate empty fields and wrong log in info
                    alertMessage = "Invalid customer and/or PIN number";
                }
            }
    }
}
