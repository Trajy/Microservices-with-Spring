package trajy.hrpayroll.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients(basePackages = {
	"trajy.hrpayroll.client"
})
@EntityScan(basePackages = {
	"trajy.hrpayroll.model"
})
@ComponentScan(basePackages = {
	"trajy.hrpayroll.config",
	"trajy.hrpayroll.controller",
	"trajy.hrpayroll.service"
})
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class HrpayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrpayrollApplication.class, args);
	}

}
