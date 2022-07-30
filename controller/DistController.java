package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.DistBean;
import com.dao.DistDAO;

@Controller
public class DistController {
	@Autowired
	DistDAO distDAO;
	
	@RequestMapping(value = "data", method = RequestMethod.GET)
	public @ResponseBody List<DistBean> getDistList(@RequestParam("stCode") String stCode){
	System.out.println("dadddadad");
	    List<DistBean> list = distDAO.getDistList(stCode);
	    System.out.println("list "+list.size());
	    return list;
	}
}
