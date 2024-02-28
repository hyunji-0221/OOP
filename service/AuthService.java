package service;

import model.UserDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    String addUsers();
    String join(Scanner scan);
    String login();
    UserDTO findUserById(String userName);
    Map<String, UserDTO> getUserMap();
    String countUsers();
}
