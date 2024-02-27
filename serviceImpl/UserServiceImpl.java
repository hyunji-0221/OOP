package serviceImpl;

import model.UserDTO;
import service.AuthService;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static UserService instance = new UserServiceImpl();

    public UserServiceImpl(){

    }

    public static UserService getInstance(){
        return instance;
    }

    @Override
    public String join(UserDTO user) {
        System.out.println("");
        return null;
    }

    @Override
    public String login(UserDTO user) {
        return null;
    }

    @Override
    public String findUserById(String userName) {
        return null;
    }

    @Override
    public String updatePassword(UserDTO user) {
        return null;
    }

    @Override
    public String deleteUser(String userName) {
        return null;
    }

    @Override
    public List<UserDTO> getUserList() {

        return null;
    }

    @Override
    public List<UserDTO> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDTO> findUsersByJob(String job) {
        return null;
    }

    @Override
    public String countUsers() {
        return "";
    }
}
