package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, UserDTO> users;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String join(Scanner scan) {
        System.out.println("ID, 비밀번호, 비밀번호확인, 이름, " +
                "주민번호, 전화번호, 주소, 직업을 입력하세요 : ");
        UserDTO user = new UserBuilder()
                .userName(scan.next())
                .password(scan.next())
                .passwordCheck(scan.next())
                .name(scan.next())
                .rrn(scan.next())
                .pNum(scan.next())
                .address(scan.next())
                .job(scan.next())
                .build()
                ;
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, UserDTO> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String userName = util.createRandomUserName();
            map.put(userName, new UserBuilder()
                    .userName(userName)
                    .password("")
                    .passwordCheck("")
                    .name(util.createRandomName())
                    .build());
        }
        users = map;
        return "더미값 추가";
    }

    @Override
    public UserDTO findUserById(String userName) {
        UserDTO user = new UserBuilder().build();
        return user;
    }

    public Map<String, UserDTO> getUserMap(){
        users.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }
}
