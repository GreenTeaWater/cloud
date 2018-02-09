package com.cloud.mp.service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.mp.common.model.Personal;
import com.cloud.mp.dao.PersonalMapper;



@Service("personalService")
public class PersonalServiceImpl implements PersonalService{

	@Autowired
	private PersonalMapper personalMapper ;

	@Override
	public Personal query(Integer id){
		return personalMapper.selectByPrimaryKey(id);
	}
}
