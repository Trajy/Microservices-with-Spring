package trajy.hruser.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EntityScan({
	"trajy.hruser.model"
})
@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

}
