package service;

import model.UserDTO;

import java.util.List;

public interface UserService {
    String join (UserDTO user);
    String login(UserDTO user);
    String findUserById(String userName);
    String updatePassword(UserDTO user);
    //회원탈퇴
    String deleteUser(String userName);

    //회원목록
    List<UserDTO> getUserList();
    //id검색
    List<UserDTO> findUsersByName(String name);
    //직업검색
    List<UserDTO> findUsersByJob(String job);
    String countUsers();
}
