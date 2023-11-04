package ma.enset.comptecqrses.common_api.events;

import lombok.Getter;
import ma.enset.comptecqrses.common_api.enums.AccountStatus;

public class AccountCreatedEvent extends BaseEvent<String> {
    @Getter private double initialBalmance;
    @Getter private String currency;
    @Getter private AccountStatus status;

    public AccountCreatedEvent(String id, double initialBalmance, String currency,AccountStatus status) {
        super(id);
        this.initialBalmance = initialBalmance;
        this.currency = currency;
        this.status=status;
    }


}
