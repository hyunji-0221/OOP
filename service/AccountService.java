package service;

import model.Account;

import java.util.List;

public interface AccountService {
    String createAccount(Account dto);
    String deposit(Account dto);
    String withdraw(Account dto);
    String getBalance(String accountNumber);
    String cancelAccount(String accountNumber);
    List<?> getAccounts();
}
