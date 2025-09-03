package br.com.fatec.controllers;

import java.io.IOException;

import br.com.fatec.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}