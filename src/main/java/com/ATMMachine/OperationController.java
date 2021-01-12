package com.ATMMachine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class OperationController {
    public Button depoBTN;
    public Button withdrawBTN;
    public Button logOutBTN;
    @FXML
    public Label alertText;
    public Button transferBTN;
    public Button changeAccBTN;
    public Button viewBalanceBTn;

    public void depoOnClick(ActionEvent event) {
    }

    public void withdrawOnClick(ActionEvent event) {
    }

    public void logOutOnClick(ActionEvent event) throws IOException {
        Main.changeScene("/LogIn.fxml");
    }

    public void transferOnClick(ActionEvent event) {
        alertText.setText("Unfortunately this option is not available now");
    }

    public void changeAccOnClick(ActionEvent event) throws IOException {
        Main.changeScene("/GetAccount.fxml");
    }

    public void viewBalanceOnClick(ActionEvent event) {
    }
}
