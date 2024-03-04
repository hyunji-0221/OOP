package view;

import model.Subject;
import model.User;
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

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();

        User student = User.builder()
                .name(sc.next())
                .build()
                ;

        Subject subjects = Subject.builder()
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
