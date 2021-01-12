package com.ATMMachine;

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
    public void checkAccOnClick() throws IOException {
        accountType = "Check";

        Main.changeScene("/Operation.fxml");
    }

    @FXML
    public void savingAccOnClick() throws IOException {
        accountType = "Saving";

        Main.changeScene("/Operation.fxml");
    }

    @FXML
    public void logOutOnClick() throws IOException {
        Main.changeScene("/LogIn.fxml");
    }
}
