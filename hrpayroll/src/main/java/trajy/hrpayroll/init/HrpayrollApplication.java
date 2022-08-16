package trajy.hrpayroll.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {
	"trajy.hrpayroll.model"
})
@ComponentScan(basePackages = {
	"trajy.hrpayroll.controller"
})
public class HrpayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpayrollApplication.class, args);
	}

}
