package Service;

import Model.User;

import java.util.List;

public interface UserInterface {

    String addNewUser(User user);
    User userUpdateById(int id, String nickName, int password, String photo);
    User searchByName(String nickName);
    List<User> sortByAge(int num);
    void filter();
    void getAllUser();


}
