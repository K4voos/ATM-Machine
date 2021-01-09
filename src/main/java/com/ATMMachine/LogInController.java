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
    public static Label alertText;

    public static void setAlertText(String text) {
        alertText.setText(text);
    }

    @FXML
    public void logInOnClick() throws IOException {
        int customerNumber = Integer.parseInt(cNumTEXTFIELD.getText());
        int PINNumber = Integer.parseInt(pinFIELD.getText());

        /*if () {
            alertText.setText("Invalid Characters");
            cNumTEXTFIELD.setText("");
        }*/

        ATMMenu atmMenu = new ATMMenu();
        atmMenu.getLogin(customerNumber, PINNumber);
    }
}
