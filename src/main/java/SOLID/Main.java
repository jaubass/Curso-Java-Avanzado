package SOLID;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.name = "Anthony";
        user.surname = "Flea";
        user.age = 60;
        user.mail = "flea@mail.com";

        User user2 = new User();
        user2.name = "Marcus";
        user2.surname = "Miller";
        user2.age = 60;
        user2.mail = "miller@mail.com";

        Users users = new Users();
        users.createUser(user);
        users.createUser(user2);

        //User aka = users.getUser("aka");
        //System.out.println(aka.mail);

        users.deleteUser("Marcus");
        for (User u : users.getAll()) {
            System.out.println(u.name);
        }



    }

}


