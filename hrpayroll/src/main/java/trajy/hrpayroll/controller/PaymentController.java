package trajy.hrpayroll.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trajy.hrpayroll.service.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @Autowired
    PaymentService service;

    @HystrixCommand(fallbackMethod = "getPaymentByWorkerIdFallBack")
    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<?> getPaymentByWorkerId(@PathVariable Long workerId, @PathVariable Integer days) {
        return ResponseEntity.ok(service.getPayment(workerId, days));
    }

    private ResponseEntity<?> getPaymentByWorkerIdFallBack(Long workerId, Integer days) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Requisicao para servico worker falhou");
    }
}
