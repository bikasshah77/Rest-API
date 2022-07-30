package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bean.DistBean;
import com.interfce.DistInterface;

@Repository
public class DistDAO {

	@Autowired
	DistInterface distInterface;
	
	public List<DistBean> getDistList(String stCode) {
		List<DistBean> dlist = distInterface.getDistBeanListByStCode(stCode);
		return dlist;
	}
}
