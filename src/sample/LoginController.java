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
        User user = new User(username, password);
        if (this.dataAccessor.checkUser(user)) {
            switch (user.role) {
                case CLERK:
                    this.clerkForm.showForm();
                    break;
                default:
                    break;
            }
        }
        else {
            this.loginForm.invalidDataNotification();
        }
    }

    private final LoginForm loginForm;
    private final ClerkForm clerkForm;
    private final DataAccessor dataAccessor;
}
