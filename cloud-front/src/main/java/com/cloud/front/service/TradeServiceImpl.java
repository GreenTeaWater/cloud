package com.cloud.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cloud.common.pay.app.PaymentAppService;
import com.cloud.common.pay.common.dto.PaymentOrderDTO;

@Service("tradeService")
public class TradeServiceImpl implements TradeService {

	@Autowired  
	@Qualifier("paymentAppService")
	private PaymentAppService paymentAppService ;
	
	
	@Override
	public PaymentOrderDTO payment(PaymentOrderDTO paymentOrderDTO) {
		
		return paymentAppService.payment(paymentOrderDTO);
	}

}
