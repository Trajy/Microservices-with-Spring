package trajy.hrpayroll.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Payment {

    private String name;

    private Double dailyInCome;

    private Integer days;

    public Double getTotal() {
        return days * dailyInCome;
    }
}
