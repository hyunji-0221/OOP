package serviceImpl;

import model.Subject;
import service.GradeService;

public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl(){}

    public static GradeService getInstance(){
        return instance;
    }
    @Override
    public int getTotalScore(Subject subjects) {
        int total = subjects.getKorean()+subjects.getEnglish()+subjects.getMath();
        return total;
    }

    @Override
    public double findAverage(int totalScore) {
        double avg = totalScore/3.0;
        return Math.round(avg);
    }
}
