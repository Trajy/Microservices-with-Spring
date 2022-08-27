package trajy.hroauth.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@EnableFeignClients({
	"trajy.hroauth.client"
})
@ComponentScan({
	"trajy.hroauth.controller",
	"trajy.hroauth.service"
})
@EnableEurekaClient
@SpringBootApplication
public class HrOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

}
