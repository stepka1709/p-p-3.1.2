package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    User getUser(int id);
    void deleteUser(int id);
    void editUser(User user);
    List<User> getUserList();
}
