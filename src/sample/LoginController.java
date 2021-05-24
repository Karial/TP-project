package sample;

import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    public LoginController(Stage primaryStage) throws IOException {
        this.loginForm = new LoginForm(primaryStage, this);
        this.clerkForm = new ClerkForm(primaryStage, this);
        this.referentForm = new ReferentForm(primaryStage, this);
        this.bankEmployerForm = new BankEmployerForm(primaryStage, this);
        this.inspectorForm = new InspectorForm(primaryStage, this);
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
                case REFERENT:
                    this.referentForm.showForm();
                    break;
                case BANK_EMPLOYER:
                    this.bankEmployerForm.showForm();
                    break;
                case INSPECTOR:
                    this.inspectorForm.showForm();
                    break;
                default:
                    break;
            }
        } else {
            this.loginForm.invalidDataNotification();
        }
    }

    public void exit() throws IOException {
        this.loginForm.showForm();
    }

    private final LoginForm loginForm;
    private final ClerkForm clerkForm;
    private final ReferentForm referentForm;
    private final BankEmployerForm bankEmployerForm;
    private final InspectorForm inspectorForm;
    private final DataAccessor dataAccessor;
}
