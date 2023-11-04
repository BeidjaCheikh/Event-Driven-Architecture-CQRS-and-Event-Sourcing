package ma.enset.comptecqrses.query.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.comptecqrses.common_api.enums.OperationType;
import ma.enset.comptecqrses.common_api.events.AccountActivatedEvent;
import ma.enset.comptecqrses.common_api.events.AccountCreatedEvent;
import ma.enset.comptecqrses.common_api.events.AccountCreditedEvent;
import ma.enset.comptecqrses.common_api.events.AccountDebitedEvent;
import ma.enset.comptecqrses.common_api.queries.GetAccountByIdQuery;
import ma.enset.comptecqrses.common_api.queries.GetAllAccountsQuery;
import ma.enset.comptecqrses.query.entities.Account;
import ma.enset.comptecqrses.query.entities.Operation;
import ma.enset.comptecqrses.query.repositories.AccountRepository;
import ma.enset.comptecqrses.query.repositories.OperationRepository;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class AccountServiceHandler {
    private AccountRepository accountRepository;
    private OperationRepository operationRepository;
    @EventHandler
    public void on(AccountCreatedEvent event){
        log.info("*********************************");
        log.info("AccountCreatedEvent received");
        Account account=new Account();
        account.setId(event.getId());
        account.setBalance(event.getInitialBalmance());
        account.setCurrency(event.getCurrency());
        account.setStatus(event.getStatus());
        accountRepository.save(account);

    }
    @EventHandler
    public void on(AccountActivatedEvent event) {
        System.out.println("****************************");
        System.out.println("AccountActivatedEvent received");
        Account account = accountRepository.findById(event.getId()).get();
        account.setStatus(event.getStatus());
        accountRepository.save(account);
    }
    @EventHandler
    public void on(AccountCreditedEvent event) {
        System.out.println("****************************");
        System.out.println("AccountCreditedEvent received");
        Account account = accountRepository.findById(event.getId()).get();
        Operation operationAccount = new Operation();
        operationAccount.setAmount(event.getAmount());
        operationAccount.setDate(new Date());
        operationAccount.setType(OperationType.CREDIT);
        operationAccount.setAccount(account);
        operationRepository.save(operationAccount);
        account.setBalance(account.getBalance() + event.getAmount());
        accountRepository.save(account);
    }

    @EventHandler
    public void on(AccountDebitedEvent event) {
        System.out.println("****************************");
        System.out.println("AccountDebitedEvent received");
        Account account = accountRepository.findById(event.getId()).get();
        Operation operationAccount = new Operation();
        operationAccount.setAmount(event.getAmount());
        operationAccount.setDate(new Date());
        operationAccount.setType(OperationType.DEBIT);
        operationAccount.setAccount(account);
        operationRepository.save(operationAccount);
        account.setBalance(account.getBalance() - event.getAmount());
        accountRepository.save(account);
    }
    @QueryHandler
    public List<Account>on(GetAllAccountsQuery query){
    return accountRepository.findAll();
    }
    @QueryHandler
    public Account on(GetAccountByIdQuery query){
        return accountRepository.findById(query.getId()).get();
    }

}
