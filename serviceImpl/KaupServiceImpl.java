package serviceImpl;

import model.UserDTO;
import service.KaupService;

public class KaupServiceImpl implements KaupService {
    private static KaupService instance = new KaupServiceImpl();

    private KaupServiceImpl(){}

    public static KaupService getInstance(){
        return instance;
    }

    @Override
    public String createBMI(UserDTO user)  {
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
