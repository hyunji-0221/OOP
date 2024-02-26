package view;

import builder.SubjectBuilder;
import builder.UserBuilder;
import model.SubjectDTO;
import model.UserDTO;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {
    public static void main(Scanner sc) {
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        System.out.println("국어점수 : ");
        System.out.println("영어점수 : ");
        System.out.println("수학점수 : ");
        System.out.println("평균 점수를 구하시오");

        sc = new Scanner(System.in);
        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();

        UserDTO student = new UserBuilder()
                .name(sc.next())
                .build()
                ;

        SubjectDTO subjects = new SubjectBuilder()
                .korean(util.createRandomInteger(0,100))
                .english(util.createRandomInteger(0,100))
                .math(util.createRandomInteger(0,100))
                .build()
                ;

        int totalScore = grade.getTotalScore(subjects);
        double average = grade.findAverage(totalScore);

        System.out.printf("============== 성적표 ==============\n" +
                "이름 : %s\n국어점수 : %s\n영어점수 : %s\n수학점수 : %s\n총점 : %s\n평균 :%s"
                ,student.getName()
                ,String.valueOf(subjects.getKorean())
                ,String.valueOf(subjects.getEnglish())
                ,String.valueOf(subjects.getMath())
                ,String.valueOf(totalScore)
                ,String.valueOf(average));
    }
}
