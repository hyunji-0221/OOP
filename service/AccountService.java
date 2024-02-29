package service;

import model.AccountDTO;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDTO dto);
    String deposit(AccountDTO dto);
    String withdraw(AccountDTO dto);
    String getBalance(String accountNumber);
    String cancelAccount(String accountNumber);
    List<AccountDTO> getAccounts();
}
