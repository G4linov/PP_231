package task231.service;

import task231.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUser(int id);

    List<User> getUsers();
}
