package br.com.fatec.controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SignUpAlunoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnSignAlunoConf;

    @FXML
    private ChoiceBox<?> cBoxSignAlunoCurso;

    @FXML
    private ChoiceBox<?> cBoxSignAlunoOrient;

    @FXML
    private AnchorPane paneSignAluno;

    @FXML
    private PasswordField passFldSignAluno;

    @FXML
    private PasswordField passFldSignAlunoConf;

    @FXML
    private TextField txtFldSignAlunoEmail;

    @FXML
    private TextField txtFldSignAlunoNome;

    @FXML
    private TextField txtFldSignAlunoRa;

    @FXML
    void initialize() {
        assert btnSignAlunoConf != null : "fx:id=\"btnSignAlunoConf\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert cBoxSignAlunoCurso != null : "fx:id=\"cBoxSignAlunoCurso\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert cBoxSignAlunoOrient != null : "fx:id=\"cBoxSignAlunoOrient\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert paneSignAluno != null : "fx:id=\"paneSignAluno\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert passFldSignAluno != null : "fx:id=\"passFldSignAluno\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert passFldSignAlunoConf != null : "fx:id=\"passFldSignAlunoConf\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert txtFldSignAlunoEmail != null : "fx:id=\"txtFldSignAlunoEmail\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert txtFldSignAlunoNome != null : "fx:id=\"txtFldSignAlunoNome\" was not injected: check your FXML file 'SignUpAluno.fxml'.";
        assert txtFldSignAlunoRa != null : "fx:id=\"txtFldSignAlunoRa\" was not injected: check your FXML file 'SignUpAluno.fxml'.";

    }

}
