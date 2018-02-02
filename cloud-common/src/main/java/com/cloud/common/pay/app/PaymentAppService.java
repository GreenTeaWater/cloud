package com.cloud.common.pay.app;

import com.cloud.common.pay.common.dto.PaymentOrderDTO;

public interface PaymentAppService {

	PaymentOrderDTO payment(PaymentOrderDTO paymentOrderDTO);

}
