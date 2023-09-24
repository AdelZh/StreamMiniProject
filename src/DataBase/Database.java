package DataBase;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<User> users;

    public Database(List<User> users) {
        this.users = new ArrayList<>(users);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Database{" +
                "users=" + users +
                '}';
    }
}

