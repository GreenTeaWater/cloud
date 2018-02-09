package com.cloud.mp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cloud.common.mp.dto.PersonalDTO;
import com.cloud.mp.common.model.Personal;
import com.cloud.mp.service.core.PersonalService;
@Service("personalBusiService")
public class PersonalBusiServiceImpl implements PersonalBusiService{

	@Autowired
	@Qualifier("personalService")
	private PersonalService personalService ;
	@Override
	public PersonalDTO selectById(Integer id) {
		PersonalDTO personalDTO  = new PersonalDTO() ;
		
		Personal p = personalService.query(id);
		personalDTO.setId(p.getId());
		
		return personalDTO ;
	}

}
