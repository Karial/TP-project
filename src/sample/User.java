package sample;

import java.util.Objects;

enum Role {
    CLERK,
    REFERENT,
    BANK_EMPLOYER,
    INSPECTOR
}

public class User {
    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password);
    }

    String login, password;
    Role role;

}
