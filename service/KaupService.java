package service;

import model.UserDTO;

public interface KaupService {
    public String createBMI(UserDTO user);
    public String createBodyMass(String bmi);
}
