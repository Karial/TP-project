package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

abstract public class Form {
    public Form(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    abstract public void showForm() throws IOException;

    protected Stage primaryStage;
}
