package builder;

import model.UserDTO;

public class UserBuilder {

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

    public UserDTO build(){
        return new UserDTO(userName,password,passwordCheck,name
                            ,rrn,pNum,address,job,height,weight);
    }
    public UserBuilder userName(String userName){
        this.userName = userName;
        return this;
    }
    public UserBuilder password(String password){
        this.password = password;
        return this;
    }
    public UserBuilder passwordCheck(String passwordCheck){
        this.passwordCheck = passwordCheck;
        return this;
    }
    public UserBuilder name(String name){
        this.name = name;
        return this;
    }
    public UserBuilder rrn(String rrn){
        this.rrn = rrn;
        return this;
    }
    public UserBuilder pNum(String pNum){
        this.pNum = pNum;
        return this;
    }
    public UserBuilder address(String address){
        this.address = address;
        return this;
    }
    public UserBuilder job(String job){
        this.job = job;
        return this;
    }
    public UserBuilder height(double height){
        this.height = height;
        return this;
    }
    public UserBuilder weight(double weight){
        this.weight = weight;
        return this;
    }
}
