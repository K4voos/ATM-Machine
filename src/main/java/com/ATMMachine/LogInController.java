package com.ATMMachine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInController {

    public Button logInBTN;
    public PasswordField pinFIELD;
    public TextField cNumTEXTFIELD;
    @FXML
    public static Label alertText;

    public static void setAlertText(String text) {
        alertText.setText(text);
    }

    @FXML
    public void logInOnClick() throws IOException {
//        System.out.println("logInOnClick loaded");

        int customerNumber = 0;
        int PINNumber = 0;

        try {
            customerNumber = Integer.parseInt(cNumTEXTFIELD.getText());
            PINNumber = Integer.parseInt(pinFIELD.getText());
        } catch (Exception e) {
            if (cNumTEXTFIELD.getText() == null || pinFIELD.getText() == null) {
                setAlertText("Please Enter your log in information");
                logInOnClick();
            }
        }

        ATMMenu atmMenu = new ATMMenu();
        atmMenu.getLogin(customerNumber, PINNumber);
    }
}
