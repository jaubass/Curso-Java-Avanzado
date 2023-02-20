package CleanArquitectureMinification;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String fileInfo = "info.txt";

    public ArrayList<User> convertFileInArray() {
        ArrayList<User> users = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(fileInfo));
            while (scanner.hasNext()) {
                String actualUser = scanner.next();
                String []parts = actualUser.split(",");

                User user = new User();
                user.name = parts[0];
                user.surname = parts[1];
                user.age = Integer.parseInt(parts[2]);
                user.mail = parts[3];

                users.add(user);
            }

            scanner.close();

        } catch (Exception e) {
        }
        return users;
    }

}
