package com.ATMMachine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class GetAccountController {

    public static String accountType;
    @FXML
    public Button checkAccBTN;
    @FXML
    public Button savingAccBTN;
    @FXML
    public Button logOutBTN;
    @FXML
    public Label alertText;

    public void setAlertText(String text) { //todo call it as stage loads
        alertText.setText(ATMMenu.nameMessage);
    }

    @FXML
    public void checkAccOnClick(ActionEvent event) throws IOException {
        accountType = "Check";

        Main.changeScene("/Operation.fxml");
    }

    @FXML
    public void savingAccOnClick(ActionEvent event) throws IOException {
        accountType = "Saving";

        Main.changeScene("/Operation.fxml");
    }

    @FXML
    public void logOutOnClick(ActionEvent event) throws IOException {
        Main.changeScene("/LogIn.fxml");
    }
}
