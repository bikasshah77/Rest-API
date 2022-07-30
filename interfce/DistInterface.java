package com.interfce;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bean.DistBean;

public interface DistInterface extends CrudRepository<DistBean, String> {
	List<DistBean> getDistBeanListByStCode(String stCode);
}
