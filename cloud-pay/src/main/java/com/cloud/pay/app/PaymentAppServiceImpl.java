package com.cloud.pay.app;

import org.springframework.stereotype.Service;

import com.cloud.common.pay.app.PaymentAppService;
import com.cloud.common.pay.common.dto.PaymentOrderDTO;

@Service("paymentAppService")
public class PaymentAppServiceImpl implements PaymentAppService{

	@Override
	public PaymentOrderDTO payment(PaymentOrderDTO paymentOrderDTO) {
		
		paymentOrderDTO.setName("zjy");
		
		return paymentOrderDTO;
	
	}

	
}
