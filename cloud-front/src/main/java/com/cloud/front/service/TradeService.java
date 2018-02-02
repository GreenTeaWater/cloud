package com.cloud.front.service;

import com.cloud.common.pay.common.dto.PaymentOrderDTO;

public interface TradeService {

	public PaymentOrderDTO payment(PaymentOrderDTO paymentOrderDTO);
}
