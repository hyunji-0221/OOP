package service;

import model.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {
    String addUsers();
    String join (UserDTO dto);

    String countUsers();
    List<UserDTO> userList();

//    Map<String, UserDTO> getUserMap();

    String deleteUser(String userName);

    String findByUserName(String userName);

    List<UserDTO> findByJob(String job);

    List<UserDTO> findByName(String name);

    String login(UserDTO dto);

}
