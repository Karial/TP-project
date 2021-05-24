package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button loginButton;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    void loginButtonClicked(ActionEvent event)
    {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        System.out.println("username: " + username + "\n" + "password: " + password);
    }

}
