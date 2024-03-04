package controller;

import model.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.*;

public class UserController {

    UserService userServ;

    public UserController() {
        this.userServ = UserServiceImpl.getInstance();
    }

    public String addUsers() {
        return userServ.addUsers();
    }

    public String join(Scanner scan) {
        System.out.println("회원가입정보를 입력하세요.\n" +
                "아이디 ," +
                "비밀번호 ," +
                "비밀번호확인 ," +
                "이름 ," +
                "주민번호 ," +
                "휴대폰번호 ," +
                "주소 ," +
                "직업 \n");
        User user = User.builder()
                .userName(scan.next())
                .password(scan.next())
                .passwordCheck(scan.next())
                .name(scan.next())
                .rrn(scan.next())
                .pNum(scan.next())
                .address(scan.next())
                .job(scan.next())
                .build();
        return userServ.join(user);
    }

    public String countUsers() {
        return userServ.countUsers();
    }

    public List<User> userList() {
        for (User d : userServ.userList()) {
            System.out.println(d);
        }
        return userServ.userList();
    }

    public String deleteUser(Scanner scan) {
        System.out.println("탈퇴할 회원아이디을 입력하세요.");
        String userName = scan.next();
        return userServ.deleteUser(userName);
    }

    public String findByUserName(Scanner scan) {
        System.out.println("검색할 회원아이디를 입력하세요.");
        String userName = scan.next();
        return userServ.findByUserName(userName);
    }

    public List<User> findByJob(Scanner scan) {
        System.out.println("검색할 직업을 입력하세요.");
        String job = scan.next();
        return userServ.findByJob(job);
    }

    public List<User> findByName(Scanner scan) {
        System.out.println("검색할 회원이름을 입력하세요.");
        String name = scan.next();
        return userServ.findByName(name);
    }

    public String login(Scanner scan) {
        System.out.println("아이디, 비밀번호를 입력하세요.");
        User dto = User.builder()
                .userName(scan.next())
                .password(scan.next())
                .build();
        return userServ.login(dto);
    }

    public String changePassword(Scanner scan) {
        System.out.println("비밀번호를 변경할 아이디를 입력하세요.");
        return userServ.changePassword(User.builder()
                .userName(scan.next())
                .password(scan.next())
                .build()
        );
    }
}