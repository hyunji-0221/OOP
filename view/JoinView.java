package view;

import builder.UserBuilder;
import model.UserDTO;

import java.util.Scanner;

public class JoinView {
    public static void main(Scanner scan) {
        scan = new Scanner(System.in);

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

        System.out.println(user.toString());
    }
}
