package ma.enset.comptecqrses.commands.controllers;
import java.util.stream.Stream;
import lombok.AllArgsConstructor;
import ma.enset.comptecqrses.common_api.commands.CreateAccountCommand;
import ma.enset.comptecqrses.common_api.commands.CreditAccountCommand;
import ma.enset.comptecqrses.common_api.commands.DebitAccountCommand;
import ma.enset.comptecqrses.common_api.dto.CreateAccountRequestDTO;
import ma.enset.comptecqrses.common_api.dto.CreditAccountRequestDTO;
import ma.enset.comptecqrses.common_api.dto.DebitAccountRequestDTO;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
@AllArgsConstructor
@RestController
@RequestMapping(path = "commands/account")
public class AccountCommandController {

    private CommandGateway commandGateway;
    private EventStore eventStore;

    @RequestMapping("create")
    public CompletableFuture<String> createAccount(@RequestBody CreateAccountRequestDTO request){

    CompletableFuture<String> commandResponse = commandGateway.send(new CreateAccountCommand(
            UUID.randomUUID().toString(),
            request.getInitialBalance(),
            request.getCurrency()
    ));
    return commandResponse;
    }
    @PutMapping ("credit")
    public CompletableFuture<String> creditAccount(@RequestBody CreditAccountRequestDTO request){

        CompletableFuture<String> commandResponse = commandGateway.send(new CreditAccountCommand(
                request.getAccountId(),
                request.getAmount(),
                request.getCurrency()

        ));
        return commandResponse;
    }
    @PutMapping ("debit")
    public CompletableFuture<String> debitAccount(@RequestBody DebitAccountRequestDTO request){

        CompletableFuture<String> commandResponse = commandGateway.send(new DebitAccountCommand(
                request.getAccountId(),
                request.getAmount(),
                request.getCurrency()

        ));
        return commandResponse;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String>exceptuonHandler(Exception exception){
        ResponseEntity<String>entity=new ResponseEntity<>(
                exception.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
        return entity;
    }
    @GetMapping("/eventStore/{accountId}")
    public Stream eventStore(@PathVariable String accountId){

        return  eventStore.readEvents(accountId).asStream();
    }
}
