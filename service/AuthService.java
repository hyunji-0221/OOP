package service;

import model.UserDTO;

import java.util.Map;
import java.util.Scanner;

public interface AuthService {
    //회원가입 성공 메시지 반환 -> 리턴타입 String
    String join(Scanner scan);
    //로그인 성공 메시지 반환 -> 리턴타입 String
    String login();
    String addUsers();
    UserDTO findUser(String userName);
    Map<String, UserDTO> getUserMap();
    String count();
}
