package com.ATMMachine;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ATMMenu account = new ATMMenu();
        account.getLogin();
    }
}
