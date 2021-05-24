package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

class ClerkFormController {
    @FXML
    private Button logout;

    @FXML
    void logoutButtonClicked(ActionEvent event) throws IOException {

    }
}

public class ClerkForm extends Form {
    public ClerkForm(Stage primaryStage) {
        super(primaryStage);
    }

    public void showForm() throws IOException {
        URL location = getClass().getResource("clerkForm.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        fxmlLoader.setController(new ClerkFormController());
        Scene scene = new Scene(fxmlLoader.load());

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Kazakov-Melekh-Svyat");
        primaryStage.show();
    }
}
