package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

abstract public class Form {
    public Form(Stage primaryStage, LoginController loginController) {
        this.primaryStage = primaryStage;
        this.loginController = loginController;
    }

    abstract public void showForm() throws IOException;

    protected Stage primaryStage;
    protected LoginController loginController;
}
