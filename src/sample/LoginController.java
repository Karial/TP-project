package sample;

import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public LoginController(Stage primaryStage) throws IOException {
        this.loginForm = new LoginForm(primaryStage, this);
        this.clerkForm = new ClerkForm(primaryStage );
        this.dataAccessor = new DataAccessor("./src/sample/users.tsv");

        this.loginForm.showForm();
    }

    public void loginUser(String username, String password) throws IOException {
        if (this.dataAccessor.checkUser(new User(username, password))) {
            this.clerkForm.showForm();
        }
    }

    private final LoginForm loginForm;
    private final ClerkForm clerkForm;
    private final DataAccessor dataAccessor;
}
