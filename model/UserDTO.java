package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class UserDTO {
    private String userName;
    private String password;
    private String passwordCheck;
    private String name;
    private String rrn;
    private String pNum;
    private String address;
    private String job;
    private double height;
    private double weight;

}
