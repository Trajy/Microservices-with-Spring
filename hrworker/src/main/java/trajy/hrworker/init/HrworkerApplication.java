package trajy.hrworker.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {
	"trajy.hrworker.model"
})
@EnableJpaRepositories(basePackages = {
	"trajy.hrworker.repository"
})
@ComponentScan(basePackages = {
	"trajy.hrworker.controller"
})
@SpringBootApplication
public class HrworkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrworkerApplication.class, args);
	}

}
