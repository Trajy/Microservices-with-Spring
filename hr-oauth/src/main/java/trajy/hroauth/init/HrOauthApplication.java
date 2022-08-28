package trajy.hroauth.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableFeignClients({
	"trajy.hroauth.client"
})
@ComponentScan({
	"trajy.hroauth.config",
	"trajy.hroauth.controller",
	"trajy.hroauth.service"
})
@EnableEurekaClient
@SpringBootApplication
public class HrOauthApplication {

	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
		SpringApplication.run(HrOauthApplication.class, args);
	}

}
