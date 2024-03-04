package service;

import model.Subject;

public interface GradeService {

    //총점
    public int getTotalScore(Subject subjects);
    //평균
    public double findAverage(int totalScore);

}
