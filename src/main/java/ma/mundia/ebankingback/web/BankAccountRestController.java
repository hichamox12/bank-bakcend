package ma.mundia.ebankingback.web;


import ma.mundia.ebankingback.dtos.AccountHistoryDTO;
import ma.mundia.ebankingback.dtos.AccountOperationDTO;
import ma.mundia.ebankingback.dtos.BankAccountDTO;
import ma.mundia.ebankingback.exeption.BankAccountNotFoundException;
import ma.mundia.ebankingback.services.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class BankAccountRestController {

    private BankAccountService bankAccountService;


    public BankAccountRestController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/accounts/{accountId}")
    public BankAccountDTO getBankAccount(@PathVariable String accountId) throws BankAccountNotFoundException {
        return bankAccountService.getBankAccount(accountId);

    }


    @GetMapping("/accounts")
    public List<BankAccountDTO> listAccounts(){
        return bankAccountService.bankAccountList();
    }


    @GetMapping("/accounts/{accountId}/operations")
    public List<AccountOperationDTO> getHistory(@PathVariable String accountId){
        return bankAccountService.accountHistory(accountId);
    }

    @GetMapping("/accounts/{accountId}/pageOperations")
    public AccountHistoryDTO getAccountHistory(@PathVariable String accountId,
                                               @RequestParam(name = "page",defaultValue = "0") int page,
                                               @RequestParam(name = "page",defaultValue = "5")int size) throws BankAccountNotFoundException {
        return bankAccountService.getAccountHistory(accountId,page,size);
    }

}
