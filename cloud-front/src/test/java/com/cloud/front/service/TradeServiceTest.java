package com.cloud.front.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cloud.common.pay.common.dto.PaymentOrderDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext.xml","classpath*:/applicationContext-hessian-client.xml"})
public class TradeServiceTest {

	@Autowired
	@Qualifier("tradeService")
	private TradeService tradeService ;
	
	@Test
	public void payment(){
		
		PaymentOrderDTO paymentOrderDTO = new PaymentOrderDTO() ;
		paymentOrderDTO.setId("100");
		paymentOrderDTO.setName("zhaofx");
		
		paymentOrderDTO = tradeService.payment(paymentOrderDTO);
		System.out.println(paymentOrderDTO);
	}
	
}
