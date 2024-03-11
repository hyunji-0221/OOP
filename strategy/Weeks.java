package strategy;

import java.util.Scanner;

enum Week{
    SUNDAY{
        @Override
        public String days() {
            return "일";
        }
    },
    MONDAY {
        @Override
        public String days() {
            return "월";
        }
    },
    TUESDAY {
        @Override
        public String days() {
            return "화";
        }
    };
    public abstract String days();
}
public class Weeks {
    public static String weekDay(Week w){
        return w.days();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(weekDay(Week.valueOf(scan.next()))+"요일");
    }
}
