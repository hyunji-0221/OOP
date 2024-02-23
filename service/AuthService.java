package service;

public interface AuthService {
    //회원가입 성공 메시지 반환 -> 리턴타입 String
    public String join();
    //로그인 성공 메시지 반환 -> 리턴타입 String
    public String login();

}
