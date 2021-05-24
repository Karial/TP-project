package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

class ClerkFormController {
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
