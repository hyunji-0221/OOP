package controller;

import model.UserDTO;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController {
    AuthService auth;
    public AuthController() {
        this.auth = AuthServiceImpl.getInstance();
    }

    public String join(Scanner scan) {
        return auth.join(scan);
    }

    public String login(Scanner scan) {
        System.out.println("로그인할 ID 입력");
        return auth.login();
    }

    public Map<String, UserDTO> addUsers() {
        auth.addUsers();
        return null;
    }

    public UserDTO findUserById(Scanner scan) {
        System.out.println("검색할 ID 입력 : ");
        UserDTO dto = auth.findUserById(scan.next());
        return null;
    }

    public Map<String, UserDTO> getUserMap(){
        return auth.getUserMap();
    }

    public String countUsers(){
        System.out.println("회원수 : "+auth.countUsers()+"명");
        return auth.countUsers();
    }
}
