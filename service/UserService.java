package service;

import model.User;

import java.util.List;

public interface UserService {
    String addUsers();
    String join (User dto);

    String countUsers();
    List<User> userList();

    String deleteUser(String userName);

    String findByUserName(String userName);

    List<User> findByJob(String job);

    List<User> findByName(String name);

    String login(User dto);

    String changePassword(User dto);

}
