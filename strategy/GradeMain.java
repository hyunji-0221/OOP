package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

enum Grade {
    A(a-> a==9 || a==10),
    B(a-> a==8),
    C(a-> a==7),
    D(a-> a==6),
    F(a-> a<=5)
    ;
    private final Predicate<Integer> predicate;

    Grade(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    //람다식
    public static Grade getGrade(int score) {
        return Stream.of(Grade.values())
                .filter(i->i.predicate.test(score/10))
                .findAny().orElseThrow(()-> new IllegalArgumentException("exception"));
    }

}

public class GradeMain {
    String getGrade(int score) {
        return Grade.getGrade(score)+"";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeMain g = new GradeMain();
        String s = g.getGrade(scan.nextInt());
        System.out.println(s);
    }
}
