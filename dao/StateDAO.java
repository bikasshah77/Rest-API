package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.DistBean;
import com.bean.StateBean;
import com.interfce.DistInterface;
import com.interfce.StateInterface;

@Repository
public class StateDAO {
	@Autowired
	StateInterface stateInterface;
	@Autowired
	DistInterface distInterface;

	public List<StateBean> getStateList() {
		List<StateBean> slist = (List<StateBean>) stateInterface.findAll();
		return slist;
	}

}
