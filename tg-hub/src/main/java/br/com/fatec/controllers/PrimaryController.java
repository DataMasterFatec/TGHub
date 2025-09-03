package br.com.fatec.controllers;

import java.io.IOException;

import br.com.fatec.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
