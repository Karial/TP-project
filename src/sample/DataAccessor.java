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
        this.users = new java.util.HashSet<User>();

        while (dataRow != null) {
            st = new StringTokenizer(dataRow, "\t");
            List<String> dataArray = new ArrayList<String>();
            while (st.hasMoreElements()) {
                dataArray.add(st.nextElement().toString());
            }
            this.users.add(new User(dataArray.get(0), dataArray.get(1)));
            dataRow = TSVFile.readLine();
        }
        TSVFile.close();
    }

    public Boolean checkUser(User user) {
        return this.users.contains(user);
    }

    private java.util.HashSet<User> users;
}
