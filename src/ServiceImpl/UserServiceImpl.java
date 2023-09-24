package ServiceImpl;

import DataBase.Database;
import Model.User;
import Service.UserInterface;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserInterface {

    private Database database;

    public UserServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public String addNewUser(User user) {
        List<User> users = database.getUsers();
        boolean exist = users.stream().anyMatch(x -> x.equals(user));
        if (exist) {
            return "Already exist";
        }
        users.add(user);
        System.out.println(database.getUsers());
        return "Added";
    }

    @Override
    public void getAllUser() {
        database.getUsers().forEach(user -> System.out.println(user.toString()));
    }


    @Override
    public User userUpdateById(int id, String nickName, int password, String photo) {
        List<User> users = database.getUsers();
        for (User user : users) {
            if (user.getInstanceId() == id) {
                user.setNickName(nickName);
                user.setPassword(password);
                user.setPhoto(photo);
                return user;
            }
        }
        return null;

    }

    @Override
    public User searchByName(String nickName) {
        return database.getUsers()
                .stream()
                .filter(x -> x.getNickName().equals(nickName))
                .findFirst()
                .orElse(null);

    }

    @Override
    public List<User> sortByAge(int num) {
        List<User> users = database.getUsers();
        users.sort((o1, o2) -> num == 1 ? o1.getAge() - o2.getAge() : o2.getAge() - o1.getAge());
        return users;

    }

    @Override
    public void filter() {
        System.out.println(database.getUsers()
                .stream()
                .collect(Collectors.groupingBy(User::getAge)));

    }
}
