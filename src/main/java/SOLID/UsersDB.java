package SOLID;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersDB {

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

    public void insert (User user) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileInfo, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separateUsers(user));
            printStream.flush();
            printStream.close();

        } catch (Exception e) {

        }
    }

    private String separateUsers(User user) {
        return user.name + ","
                + user.surname + ","
                + user.age + ","
                + user.mail + "";
    }

    public void deleteUsers (User user) {
        ArrayList<User> users = convertFileInArray();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).name.equalsIgnoreCase(user.name)) {
                users.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(fileInfo);

            for (User actualUser : users) {
                String userSeparated = separateUsers(actualUser);
                printStream.println(userSeparated);
            }
            printStream.flush();
            printStream.close();

            } catch (Exception e) {

            }

    }
}
