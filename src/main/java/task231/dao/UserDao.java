package task231.dao;

import task231.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    void deleteUserById(int id);

    User getUser(int id);

    List<User> getUsers();
}
