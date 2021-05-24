package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DataAccessor {
    DataAccessor(String path) throws IOException {
        StringTokenizer st;
        BufferedReader TSVFile = new BufferedReader(new FileReader(path));
        String dataRow = TSVFile.readLine();
        this.users = new java.util.HashMap<User, Role>();

        while (dataRow != null) {
            st = new StringTokenizer(dataRow, "\t");
            List<String> dataArray = new ArrayList<String>();
            while (st.hasMoreElements()) {
                dataArray.add(st.nextElement().toString());
            }
            Role role = Role.REFERENT;
            switch (dataArray.get(2)) {
                case "clerk":
                    role = Role.CLERK;
                    break;
                case "referent":
                    role = Role.REFERENT;
                    break;
                case "bank employer":
                    role = Role.BANK_EMPLOYER;
                    break;
                case "inspector":
                    role = Role.INSPECTOR;
                    break;
            }
            this.users.put(new User(dataArray.get(0), dataArray.get(1)), role);
            dataRow = TSVFile.readLine();
        }
        TSVFile.close();
    }
    
    boolean checkUser(User user) {
        if (this.users.get(user) != null) {
            user.role = this.users.get(user);
            return true;
        }
        return false;
    }

    java.util.HashMap<User, Role> users;
}
