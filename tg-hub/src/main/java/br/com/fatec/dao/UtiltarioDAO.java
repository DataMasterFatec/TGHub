package br.com.fatec.dao;

import br.com.fatec.controllers.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class UtiltarioDAO {

    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username) {
        Parent root = null;

        if (username != null) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(UtiltarioDAO.class.getResource(fxmlFile));
                root = fxmlLoader.load();
                LoginController loginController = fxmlLoader.getController();
                loginController.setUserInformation(username);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Lógica para carregar a nova cena com o nome de usuário
            // Exemplo: root = FXMLLoader.load(getClass().getResource(fxmlFile));
        } else {
            try {
                root = FXMLLoader.load(UtiltarioDAO.class.getResource(fxmlFile));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Lógica para carregar a nova cena sem o nome de usuário
            // Exemplo: root = FXMLLoader.load(getClass().getResource(fxmlFile));
        }
    }
}
