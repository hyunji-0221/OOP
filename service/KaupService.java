package service;

import model.User;

public interface KaupService {
    public String createBMI(User user);
    public String createBodyMass(String bmi);
}
