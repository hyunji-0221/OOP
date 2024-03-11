package strategy;

enum Rank {
    ; //자동으로 들어온 세미콜론의 의미 = 상수가 없어(제일 위에 있어야함, 상수를 구성하는 값을 final로 주었으니 값을 바꾸지 말라)
    //final의 의미 immutable
    private final int match;
    private final int money;
    private int count;

    Rank(int match, int money) {
        this.match = match;
        this.money = money;
    }

    public void plusCount(){
        this.count++;
    }
}

public class RankMain {
    public static void main(String[] args) {

    }
}
