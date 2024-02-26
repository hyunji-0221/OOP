import view.BoardView;
import view.GradeView;
import view.JoinView;
import view.KaupView;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("0-종료 1-회원가입 2-성적표 3-게시판 4-카우프");

            switch (scan.next()){
                case "0" :
                    System.out.println("종료되었습니다.");
                    return;
                case "1" :
                    System.out.println("회원가입");
                    JoinView.main(scan);
                    break;
                case "2" :
                    System.out.println("성적표");
                    GradeView.main(scan);
                    break;
                case "3" :
                    System.out.println("게시판");
                    BoardView.main();
                    break;
                case "4" :
                    System.out.println("카우프");
                    KaupView.main(scan);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}