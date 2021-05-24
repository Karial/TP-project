package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

class InspectorFormController {
    @FXML
    private Button logout;

    InspectorFormController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    void logoutButtonClicked(ActionEvent event) throws IOException {
        this.loginController.exit();
    }

    private final LoginController loginController;
}

public class InspectorForm extends Form {
    public InspectorForm(Stage primaryStage, LoginController loginController) {
        super(primaryStage, loginController);
    }

    public void showForm() throws IOException {
        URL location = getClass().getResource("inspectorForm.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        fxmlLoader.setController(new InspectorFormController(super.loginController));
        Scene scene = new Scene(fxmlLoader.load());

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Kazakov-Melekh-Svyat");
        primaryStage.show();
    }
}
