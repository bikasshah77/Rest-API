package com.interfce;

import org.springframework.data.repository.CrudRepository;

import com.bean.StateBean;

public interface StateInterface extends CrudRepository<StateBean, String> {
	StateBean getStateBeanNameByStName(String stName);//get name by ID
}
