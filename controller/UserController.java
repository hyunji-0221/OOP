package controller;

import model.UserDTO;
import service.AuthService;
import service.UserService;
import serviceImpl.AuthServiceImpl;
import serviceImpl.UserServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserController{

    UserService userServ;

    public UserController(){
        this.userServ = UserServiceImpl.getInstance();
    }
    public void addUsers(){
        AuthServiceImpl.getInstance().addUsers();
    }


    public String join(UserDTO user) {
        return userServ.join(user);
    }

    public String login(UserDTO user) {
        return userServ.login(user);
    }

    public String findUserById(String userName) {
        return userServ.findUserById(userName);
    }

    public String updatePassword(UserDTO user) {
        return userServ.updatePassword(user);
    }

    public String deleteUser(String userName) {
        return userServ.deleteUser(userName);
    }

    public List<UserDTO> getUserList() {
        return userServ.getUserList();
    }

    public List<UserDTO> findUsersByName(String name) {
        return userServ.findUsersByName(name);
    }

    public List<UserDTO> findUsersByJob(String job) {
        return userServ.findUsersByJob(job);
    }

    public String countUsers() {
        return userServ.countUsers();
    }
}