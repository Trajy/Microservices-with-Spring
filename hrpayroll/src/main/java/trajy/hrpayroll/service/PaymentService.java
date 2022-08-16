package trajy.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import trajy.hrpayroll.model.Payment;
import trajy.hrpayroll.model.Worker;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hrworker.host}")
    private String hrWorkerHostAdress;

    @Autowired
    RestTemplate restTemplate;

    public Payment getPayment(Long workerId, Integer days) {
        Map<String, String> urlPathVariables = new HashMap<>();
        urlPathVariables.put("id", workerId.toString());
        Worker worker = restTemplate.getForObject(hrWorkerHostAdress + "/workers/{id}", Worker.class, urlPathVariables);
        Payment payment = Payment.builder().name(worker.getName()).dailyInCome(worker.getDailyInCome()).days(days).build();
        return payment;
    }

}
