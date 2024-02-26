package view;

public class PhoneInheritance {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("--------집전화--------");
        phone.setCompany("금성");
        phone.setCall("제임스");

        System.out.println(phone);

        System.out.println("--------휴대전화--------");
        CellPhone cp = new CellPhone();
        cp.setCompany("노키아");
        cp.setCall("에릭");

        cp.setPortable(true);

        System.out.println(cp);

        System.out.println("--------아이폰--------");
        IPhone apple = new IPhone();
        apple.setCompany("애플");
        apple.setCall("톰");
        apple.setPortable(true);
        apple.setData("전송하다");

        System.out.println(apple); //애플 아이폰으로 톰에게 폰을 휴대할 수 있음 데이터를 전송한다.

        System.out.println("--------갤럭시노트--------");
        //삼성 갤럭시노트로 제인에게 폰을 휴대할 수 있음 데이터를 전송한다.
        AndroidPhone andPhone = new AndroidPhone();
        andPhone.setCompany("삼성");
        andPhone.setCall("제인");
        andPhone.setSize("10인치");
        andPhone.setPortable(true);
        andPhone.setData("전송하다.");

        System.out.println(andPhone);
    }
}

class AndroidPhone extends IPhone {
    public static String BRAND = "갤럭시노트";
    private String size;

    @Override
    public String toString() {
        return "갤럭시{" +
                "company=" + company + '\n' +
                "사이즈= " + size + "\n" +
                "브랜드= " + BRAND + "\n" +
                "call=" + super.call + '\n' +
                "move=" + super.move + '\n' +
                "data=" + super.data + '\n' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class IPhone extends CellPhone {
    protected String data;
    public static String BRAND = "iPhone";

    @Override
    public String toString() {
        return "아이폰{" +
                "제조사=" + super.company + '\'' +
                BRAND + '\n'
                + super.call + '\n' +
                "이동유무=" + super.move + '\n' +
                "data=" + data + '\n' +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


class CellPhone extends Phone {
    protected boolean portable; //이동성
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        if (portable) {
            this.setMove("폰을 휴대할 수 있음");
        } else {
            this.setMove("폰을 휴대할 수 없음");
        }
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {

        this.move = move;
    }

    @Override
    public String toString() {
        return "휴대폰{" + "제조사='" + super.company + '\'' +
                ", 수신자='" + super.call + '\'' +
                ", 이동성=" + portable +
                ", 이동유무='" + move + '\'' +
                '}';
    }
}

class Phone {
    protected String company, call; // 인스턴스 변수 = 멤버변수 => 힙영역
    static final double TAX_RATE = 0.095; //스태틱 변수 = 전역변수 => 스태틱 영역

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company + "에서 제작하다";
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call + "에게 전화를 걸다";
    }

    @Override
    public String toString() {
        return "집전화{" +
                "제조사='" + company + '\'' +
                ", 수신자='" + call + '\'' +
                '}';
    }
}
