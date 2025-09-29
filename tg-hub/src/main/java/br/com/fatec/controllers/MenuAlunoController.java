package br.com.fatec.controllers;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MenuAlunoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton bntAlunoBaixarMD;

    @FXML
    private JFXButton btnAlunoConfigs;

    @FXML
    private JFXButton btnAlunoEntregas;

    @FXML
    private JFXButton btnAlunoPortifolio;

    @FXML
    private Label painelAluno;

    @FXML
    private AnchorPane paneSuperiorMenuAluno;

    @FXML
    private SplitPane splitPanelMenuAluno;

    @FXML
    private Label txtMenuAlunoCursoAluno;

    @FXML
    private Label txtMenuAlunoNomeAluno;

    @FXML
    private Label txtMenuAlunoOrientadorAluno;

    @FXML
    private VBox vboxMenuAluno;


    @FXML
    void initialize() {
        assert bntAlunoBaixarMD != null : "fx:id=\"bntAlunoBaixarMD\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert btnAlunoConfigs != null : "fx:id=\"btnAlunoConfigs\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert btnAlunoEntregas != null : "fx:id=\"btnAlunoEntregas\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert btnAlunoPortifolio != null : "fx:id=\"btnAlunoPortifolio\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert painelAluno != null : "fx:id=\"painelAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert paneSuperiorMenuAluno != null : "fx:id=\"paneSuperiorMenuAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert splitPanelMenuAluno != null : "fx:id=\"splitPanelMenuAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert txtMenuAlunoCursoAluno != null : "fx:id=\"txtMenuAlunoCursoAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert txtMenuAlunoNomeAluno != null : "fx:id=\"txtMenuAlunoNomeAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert txtMenuAlunoOrientadorAluno != null : "fx:id=\"txtMenuAlunoOrientadorAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";
        assert vboxMenuAluno != null : "fx:id=\"vboxMenuAluno\" was not injected: check your FXML file 'MenuAluno.fxml'.";

    }

}
