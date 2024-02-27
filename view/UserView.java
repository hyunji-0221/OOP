package view;

import controller.AuthController;
import controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        UserController ctrl = new UserController();
        ctrl.addUsers();

        while (true) {
            System.out.println("[메뉴] 0-종료\n" +
                    "1-회원가입\n" +
                    "2-로그인\n" +
                    "3-마이페이지\n" +
                    "4-비번변경\n" +
                    "5-탈퇴\n" +
                    "6-회원목록\n" +
                    "7-ID검색\n" +
                    "8-직업검색\n" +
                    "9-회원수");
            switch (scan.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("======= 회원가입 =======");
                    ctrl.join()
                    break;
                case "6":
                    System.out.println("======= 회원목록 =======");
                    break;
            }
        }

    }
}
