package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {

    Map<String, ?> userMap ;
    List<?> userList ;

    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){
        this.userMap = new HashMap<>();
        this.userList = new ArrayList<>();
    }

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public String createBMI(User user)  {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = weight/((height/100)*(height/100));

        return String.valueOf(bmi);
    }

    @Override
    public String createBodyMass(String bmi) {
        double doubleBmi = Double.parseDouble(bmi);
        if(doubleBmi>25.0){
            bmi = "비만";
        }else if(doubleBmi>23.0){
            bmi = "과체중";
        }else if(doubleBmi>18.5){
            bmi = "정상";
        }else{
            bmi = "저체중";
        }
        return bmi;
    }
}
