package trajy.hrpayroll.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import trajy.hrpayroll.model.Worker;

@FeignClient(
    name = "hr-worker",
    path = "/workers"
)
public interface WorkerClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);

}
