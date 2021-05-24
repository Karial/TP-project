package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

class LoginFormController {
    LoginFormController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    private Button loginButton;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;


    @FXML
    void loginButtonClicked(ActionEvent event) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        this.loginController.loginUser(username, password);
    }

    private final LoginController loginController;
}

public class LoginForm extends Form {
    public LoginForm(Stage primaryStage, LoginController loginController) {
        super(primaryStage, loginController);
        this.loginController = loginController;
    }

    public void showForm() throws IOException {
        URL location = getClass().getResource("loginForm.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        fxmlLoader.setController(new LoginFormController(loginController));
        Scene scene = new Scene(fxmlLoader.load());

        this.primaryStage.setScene(scene);
        this.primaryStage.setResizable(false);
        this.primaryStage.setTitle("Kazakov-Melekh-Svyat");
        this.primaryStage.show();
    }

    public void invalidDataNotification() {
        Alert alert = new Alert(Alert.AlertType.NONE,
                "Invalid username or password", ButtonType.OK);
        alert.show();
    }

    private final LoginController loginController;
}
