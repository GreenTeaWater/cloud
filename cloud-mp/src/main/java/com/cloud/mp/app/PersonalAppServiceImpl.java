package com.cloud.mp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cloud.common.mp.app.PersonalAppService;
import com.cloud.common.mp.dto.PersonalDTO;
import com.cloud.mp.service.impl.PersonalBusiService;

@Service("personalAppService")
public class PersonalAppServiceImpl implements PersonalAppService{

	@Autowired
	@Qualifier("personalBusiService")
	private PersonalBusiService personalBusiService ;
	
	@Override
	public PersonalDTO selectById(Integer id) {
		return personalBusiService.selectById(id);
		
	}

	
}
