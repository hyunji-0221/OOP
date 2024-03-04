package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AccountController {
    AccountService acServ;

    public AccountController() {
        this.acServ = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner scan) {
        System.out.println("id, acNum, acH, bal");
        return acServ.createAccount(Account.builder()
                .id(scan.nextLong())
                .accountNumber(scan.next())
                .accountHolder(scan.next())
                .balance(scan.nextDouble())
                .transactionDate(LocalDate.now())
                .build());
    }

    public String deposit(Scanner scan) {
        return acServ.deposit(Account.builder()
                .id(scan.nextLong())
                .accountNumber(scan.next())
                .accountHolder(scan.next())
                .balance(scan.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String withdraw(Scanner scan) {
        return acServ.withdraw(Account.builder()
                .id(scan.nextLong())
                .accountNumber(scan.next())
                .accountHolder(scan.next())
                .balance(scan.nextDouble())
                .transactionDate(null)
                .build());
    }

    public String getBalance(Scanner scan) {
        return acServ.getBalance(scan.next());
    }

    public String cancelAccount(Scanner scan) {
        System.out.println("Insert accountNumber to remove");
        return acServ.cancelAccount(scan.next());
    }

    public List<Account> getAccounts() {
        return acServ.getAccounts();
    }
}
