package serviceImpl;

import builder.UserBuilder;
import model.UserDTO;
import service.AuthService;
import service.UserService;
import service.UtilService;

import java.util.*;

public class UserServiceImpl implements UserService {

    Map<String, UserDTO> users;
    private static UserService instance = new UserServiceImpl();

    public UserServiceImpl() {
        this.users = new HashMap<>();
    }

    public static UserService getInstance() {
        return instance;
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
                    .job(Integer.toString(util.createRandomInteger(10, 5)))
                    .build());
        }
        users = map;
        return users.size() + "개 더미값 추가";
    }

    @Override
    public String join(UserDTO dto) {
        users.put(dto.getUserName(), dto);
        return "회원가입되었습니다.";
    }

    @Override
    public String countUsers() {
        String userNum = String.valueOf(users.size());
        return userNum;
    }

    @Override
    public List<UserDTO> userList() {
        List<UserDTO> userList = new ArrayList<>();
        users.forEach((k, v) -> {
            userList.add(v);
        });
        return userList;
    }

//    @Override
//    public Map<String, UserDTO> getUserMap() {
//        System.out.println("전체목록출력");
//        return users;
//    }

    @Override
    public String deleteUser(String userName) {
        if (users.containsKey(userName)) {
            users.remove(userName);
            return "회원탈퇴되었습니다.";
        } else {
            return "회원정보가 없습니다.";
        }
    }

    @Override
    public String findByUserName(String userName) {
        if (users.containsKey(userName)) {
            return users.get(userName).toString();

        } else {
            return "일치하는 회원정보가 없습니다.";
        }
    }

    @Override
    public List<UserDTO> findByJob(String job) {
        List<UserDTO> userList = new ArrayList<>();

        users.forEach((k, v) -> {
            if (job.equals(users.get(k).getJob())) {
                userList.add(v);
            }
        });

        System.out.println(userList);
        return userList;
    }

    @Override
    public List<UserDTO> findByName(String name) {
        List<UserDTO> userList = new ArrayList<>();
        users.forEach((k, v) -> {
            if (name.equals(users.get(k).getName())) {
                userList.add(v);
            }
        });
        return userList;
    }

    @Override
    public String login(UserDTO dto) {
        UserDTO userInMap = users.get(dto.getUserName());
        if (userInMap == null) {
            return "아이디를 다시 입력하세요.";
        } else {
            if (userInMap.getPassword().equals(dto.getPassword())) {
                return "로그인 성공";
            } else {
                return "비밀번호를 다시 입력하세요.";
            }
        }
    }

    @Override
    public boolean forChangePwById(String userName) {
        if (users.containsKey(userName)) {
            return true;
        } else {
            return false;
        }
    }


}
