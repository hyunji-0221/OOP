package view;

import builder.UserBuilder;
import model.UserDTO;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {
    public static void main(Scanner scan) {
        scan = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();

        UserDTO user = new UserBuilder()
                .height(util.createRandomDouble(150,50))
                .weight(util.createRandomDouble(30,69))
                .build()
        ;

        KaupService kaup = KaupServiceImpl.getInstance();

        String bmi = kaup.createBMI(user);
        String bodyMass = kaup.createBodyMass(bmi);
        System.out.printf("========== BMI 계산 ==========\nBMI는 : " +
                            "%s\n체지방은 : %s\n========== BMI 계산 =========="
                            ,bmi,bodyMass);

    }
}
