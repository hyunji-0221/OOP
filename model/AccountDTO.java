package model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class AccountDTO {

    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private LocalDate transactionDate;

}
