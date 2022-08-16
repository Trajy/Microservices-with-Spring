package trajy.hrpayroll.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trajy.hrpayroll.model.Payment;

import static trajy.hrpayroll.util.PaymentUtils.getPayment;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @GetMapping(value = "/{workerId}/days/{days}")
    public static ResponseEntity<Payment> getPaymentByWorkerId(@PathVariable Long workerId, @PathVariable Integer days) {
        return ResponseEntity.ok(getPayment(workerId, days));
    }
}
