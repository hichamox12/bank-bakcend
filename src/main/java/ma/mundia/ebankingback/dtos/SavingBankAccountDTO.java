package ma.mundia.ebankingback.dtos;

import lombok.Data;
import ma.mundia.ebankingback.enums.AccountStatus;

import java.util.Date;


@Data
public class SavingBankAccountDTO extends BankAccountDTO{

    private String id;
    private double balance ;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;

}
