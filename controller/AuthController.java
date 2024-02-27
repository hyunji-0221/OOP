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

    public String login() {
        return auth.login();
    }

    public Map<String, UserDTO> addUsers() {
        auth.addUsers();
        return null;
    }

    public UserDTO findUser(String userName) {
        auth.findUser(userName);
        return null;
    }

    public Map<String, UserDTO> getUserMap(){
        return auth.getUserMap();
    }

    public String count(){
        System.out.println("회원수 : "+auth.count()+"명");
        return auth.count();
    }
}
