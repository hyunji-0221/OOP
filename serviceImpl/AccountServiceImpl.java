package serviceImpl;

import builder.AccountBuilder;
import model.AccountDTO;
import model.UserDTO;
import service.AccountService;
import service.AuthService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements AccountService {

   List<AccountDTO> acList;

    private static AccountService instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        this.acList = new ArrayList<>();
    }

    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(AccountDTO dto) {
        acList.add(dto);
        return "Create Account Success";
    }
    @Override
    public String deposit(AccountDTO dto) {
        return null;
    }
    @Override
    public String withdraw(AccountDTO dto) {
        return null;
    }
    @Override
    public String getBalance(String accountNumber) {
        return null;
    }
    @Override
    public String cancelAccount(String accountNumber) {
        System.out.println(acList);
        return "Remove Success";
    }
    @Override
    public List<AccountDTO> getAccounts() {
        return acList;
    }
}
