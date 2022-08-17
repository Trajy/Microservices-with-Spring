package trajy.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trajy.hrpayroll.client.WorkerClient;
import trajy.hrpayroll.model.Payment;
import trajy.hrpayroll.model.Worker;

@Service
public class PaymentService {

    @Autowired
    WorkerClient client;

    public Payment getPayment(Long workerId, Integer days) {
        Worker worker = client.findById(workerId).getBody();
        Payment payment = Payment.builder().name(worker.getName()).dailyInCome(worker.getDailyInCome()).days(days).build();
        return payment;
    }

}
