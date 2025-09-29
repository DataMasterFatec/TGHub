package br.com.fatec.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton btnLogar;

    @FXML
    private JFXButton btnSignAluno;

    @FXML
    private JFXButton btnSignOrientador;

    @FXML
    private AnchorPane paneLoginAcc;

    @FXML
    private HBox paneLoginHbox;

    @FXML
    private AnchorPane paneLoginLogo;

    @FXML
    private AnchorPane paneSignBtns;

    @FXML
    private AnchorPane paneSignData;

    @FXML
    private HBox paneSignHbox;

    @FXML
    private AnchorPane paneSignLogo;

    @FXML
    private SplitPane paneSignSplit;

    @FXML
    private Tab tabLogin;

    @FXML
    private Tab tabSign;

    @FXML
    private PasswordField txtFldPass;

    @FXML
    private TextField txtFldUser;

    // ============================================
    // MÉTODOS PARA TROCAR OS PANEIS DE CADASTRO
    // ============================================

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    @FXML
    private void handleSignAluno() throws IOException {
        loadPane("/br/com/fatec/ui/SignUpAluno.fxml");
    }

    @FXML
    private void handleSignOrientador() throws IOException {
        loadPane("/br/com/fatec/ui/SignUpOrientador.fxml");
    }


    private void loadPane(String fxmlPath) throws IOException {
        AnchorPane pane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlPath)));
        paneSignData.getChildren().clear();
        paneSignData.getChildren().add(pane);

        //faz o novo painel preencher todo o espaço
        AnchorPane.setTopAnchor(pane, 0.0);
        AnchorPane.setRightAnchor(pane, 0.0);
        AnchorPane.setBottomAnchor(pane, 0.0);
        AnchorPane.setLeftAnchor(pane, 0.0);
    }

    // ============================================
    // MÉTODO DE INICIALIZAÇÃO PADRÃO
    // ============================================

    @FXML
    void initialize() {
        assert btnLogar != null : "fx:id=\"btnLogar\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnSignAluno != null : "fx:id=\"btnSignAluno\" was not injected: check your FXML file 'Login.fxml'.";
        assert btnSignOrientador != null : "fx:id=\"btnSignOrientador\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneLoginAcc != null : "fx:id=\"paneLoginAcc\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneLoginHbox != null : "fx:id=\"paneLoginHbox\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneLoginLogo != null : "fx:id=\"paneLoginLogo\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneSignBtns != null : "fx:id=\"paneSignBtns\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneSignData != null : "fx:id=\"paneSignData\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneSignHbox != null : "fx:id=\"paneSignHbox\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneSignLogo != null : "fx:id=\"paneSignLogo\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneSignSplit != null : "fx:id=\"paneSignSplit\" was not injected: check your FXML file 'Login.fxml'.";
        assert tabLogin != null : "fx:id=\"tabLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert tabSign != null : "fx:id=\"tabSign\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtFldPass != null : "fx:id=\"txtFldPass\" was not injected: check your FXML file 'Login.fxml'.";
        assert txtFldUser != null : "fx:id=\"txtFldUser\" was not injected: check your FXML file 'Login.fxml'.";
    }

    public void setUserInformation(String username) {

    }
}
