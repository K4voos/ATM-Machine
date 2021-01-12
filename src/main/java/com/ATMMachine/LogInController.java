package com.ATMMachine;

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
    public Label alertText;

    public void setAlertText(String text) {
        alertText.setText(text);
    }

    @FXML
    public void logInOnClick() throws IOException {

        int customerNumber = 0;
        int PINNumber = 0;

        try {
            customerNumber = Integer.parseInt(cNumTEXTFIELD.getText());
            PINNumber = Integer.parseInt(pinFIELD.getText());
        } catch (Exception e) {
                setAlertText("Invalid customer and/or PIN number");
        }

        if (ATMMenu.alertMessage != null) setAlertText(ATMMenu.alertMessage);
        ATMMenu atmMenu = new ATMMenu();
        atmMenu.getLogin(customerNumber, PINNumber);
    }
}
