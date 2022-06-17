package fundamentosBackendTF.pe.edu.upc.payments.command.application.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class DepositMoneyRequestDto {
    @NotNull
    private String accountId;
    private BigDecimal amount;

    public String getAccountId(){return accountId;}
    public BigDecimal getAmount() {
        return amount;
    }
}
