package trajy.hrpayroll.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Worker {

    private Long id;

    private String name;

    private Double dailyInCome;

}
