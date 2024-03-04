package serviceImpl;

import model.Account;
import service.AccountService;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

   List<Account> acList;

    private static AccountService instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        this.acList = new ArrayList<>();
    }

    public static AccountService getInstance() {
        return instance;
    }


    @Override
    public String createAccount(Account dto) {
        acList.add(dto);
        return "Create Account Success";
    }
    @Override
    public String deposit(Account dto) {
        return null;
    }
    @Override
    public String withdraw(Account dto) {
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
    public List<Account> getAccounts() {
        return acList;
    }
}
