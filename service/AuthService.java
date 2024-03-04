package service;

import model.User;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String addUsers();
    String join(Scanner scan);
    String login();
    User findUserById(String userName);
    Map<String, User> getUserMap();
    String countUsers();
}
