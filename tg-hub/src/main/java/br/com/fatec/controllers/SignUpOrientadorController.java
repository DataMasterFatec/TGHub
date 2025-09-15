package br.com.fatec.controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SignUpOrientadorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnSignOrientConf;

    @FXML
    private CheckBox chkBoxSignOrientADS;

    @FXML
    private CheckBox chkBoxSignOrientBD;

    @FXML
    private CheckBox chkBoxSignOrientDSM;

    @FXML
    private AnchorPane paneSignOrientador;

    @FXML
    private PasswordField passFldSignOrient;

    @FXML
    private PasswordField passFldSignOrientConf;

    @FXML
    private TextField txtFldSignOrientEmail;

    @FXML
    private TextField txtFldSignOrientMat;

    @FXML
    private TextField txtFldSignOrientNome;

    @FXML
    void initialize() {
        assert btnSignOrientConf != null : "fx:id=\"btnSignOrientConf\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert chkBoxSignOrientADS != null : "fx:id=\"chkBoxSignOrientADS\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert chkBoxSignOrientBD != null : "fx:id=\"chkBoxSignOrientBD\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert chkBoxSignOrientDSM != null : "fx:id=\"chkBoxSignOrientDSM\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert paneSignOrientador != null : "fx:id=\"paneSignOrientador\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert passFldSignOrient != null : "fx:id=\"passFldSignOrient\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert passFldSignOrientConf != null : "fx:id=\"passFldSignOrientConf\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert txtFldSignOrientEmail != null : "fx:id=\"txtFldSignOrientEmail\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert txtFldSignOrientMat != null : "fx:id=\"txtFldSignOrientMat\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";
        assert txtFldSignOrientNome != null : "fx:id=\"txtFldSignOrientNome\" was not injected: check your FXML file 'SignUpOrientador.fxml'.";

    }

}
