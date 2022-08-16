package trajy.hrpayroll.util;

import trajy.hrpayroll.model.Payment;

import static trajy.hrpayroll.model.Payment.builder;

public class PaymentUtils {

    public static Payment getPayment(long workerId, int days) {
        return builder().name("bob").dailyInCome(200.0).days(2).build();
    }

}
