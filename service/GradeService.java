package service;

import model.SubjectDTO;

public interface GradeService {

    //총점
    public int getTotalScore(SubjectDTO subjects);
    //평균
    public double findAverage(int totalScore);

}
