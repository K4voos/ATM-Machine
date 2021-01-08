package com.ATMMachine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogInController {


    public Button logInBTN;
    public PasswordField pinFIELD;
    public TextField cNumTEXTFIELD;

    @FXML
    public void logInOnClick(ActionEvent event) throws IOException {
        ATMMenu atmMenu = new ATMMenu();
        atmMenu.getLogin();
    }
}
