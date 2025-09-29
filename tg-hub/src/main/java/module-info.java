module br.com.fatec {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires com.jfoenix;



    opens br.com.fatec to javafx.fxml;
    exports br.com.fatec;

    opens br.com.fatec.controllers to javafx.fxml;
    exports br.com.fatec.controllers;
    exports br.com.fatec.dao;
    opens br.com.fatec.dao to javafx.fxml;
}


