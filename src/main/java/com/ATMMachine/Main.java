package com.ATMMachine;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("/LogIn.fxml"));
        primaryStage.setTitle("Welcome to ATM machine");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void changeScene(String fxml) throws IOException{
        Parent parent = FXMLLoader.load(Main.class.getResource(fxml));
        stage.getScene().setRoot(parent);
    }

    public static void main(String[] args) throws IOException {
        launch(args);
//        ATMMenu account = new ATMMenu();
//        account.getLogin();
    }
}
