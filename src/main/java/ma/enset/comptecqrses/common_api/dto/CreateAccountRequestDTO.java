package ma.enset.comptecqrses.common_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;

@Data @NoArgsConstructor @AllArgsConstructor

public class CreateAccountRequestDTO {
    private  double initialBalance;
    private String currency;
}
