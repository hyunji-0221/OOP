package serviceImpl;

import model.User;
import service.AuthService;
import service.UtilService;

import java.util.*;

public class AuthServiceImpl implements AuthService {
    private static AuthService instance = new AuthServiceImpl();

    Map<String, User> users;
    List<User> userList ;

    private AuthServiceImpl() {
        this.users = new HashMap<>();
        this.userList = new ArrayList<>();
    }

    public static AuthService getInstance() {
        return instance;
    }

    @Override
    public String join(Scanner scan) {
        System.out.println("ID, 비밀번호, 비밀번호확인, 이름, " +
                "주민번호, 전화번호, 주소, 직업을 입력하세요 : ");
        User user = User.builder()
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
        Map<String, User> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String userName = util.createRandomUserName();
            map.put(userName, User.builder()
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
    public User findUserById(String userName) {
        User user = User.builder().build();
        return user;
    }

    public Map<String, User> getUserMap(){
        users.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String countUsers() {
        return users.size()+"";
    }
}
