package SOLID;

import java.util.ArrayList;

public class Users {

    private UsersDB userDB = new UsersDB();
    /**
     * Devuelve un listado de todos los usuarios
     * @return convertFileInArray
     */
    public ArrayList<User> getAll() {
        return userDB.convertFileInArray();
    }

    public User getUser(String name) {
        ArrayList<User> users = userDB.convertFileInArray();
        for (User actualUser : users) {
            if (actualUser.name.equalsIgnoreCase(name)) {
                return actualUser;
            }
        }
        return null;
    }

    public void createUser (User user) {
        if (getUser(user.name) != null) {
            return;
        }
        userDB.insert(user);
    }

    public void deleteUser(String name) {
        User user = new User();
        user.name = name;
        userDB.deleteUsers(user);
    }
}
