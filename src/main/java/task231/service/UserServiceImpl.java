package task231.service;

import org.springframework.stereotype.Service;
import task231.dao.UserDao;
import task231.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        this.userDao.deleteUser(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(int id) {
        return this.userDao.getUser(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return this.userDao.getUsers();
    }
}
