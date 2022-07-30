package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.CommonBean;
import com.dao.LoginDAO;
import com.dto.RegisterDTO;
import com.interfce.StateInterface;

@Controller
public class LoginController {
	@Autowired
	RegisterDTO registerDTO;
	@Autowired
	LoginDAO loginDAO;
	@Autowired
	StateInterface stateInterface;


	@RequestMapping(value = "loginDetail", method = RequestMethod.POST)
	public String Login(@ModelAttribute("lgn")RegisterDTO registerDTO, ModelMap m) {
		String name = loginDAO.loginDetail(registerDTO);
		System.out.println(registerDTO.getName()+" "+registerDTO.getPass());
		if(name.equalsIgnoreCase(registerDTO.getName())) {
			m.addAttribute("lgn",registerDTO);
			return "success";
		}else {
			return "error";
		}
	}
	
	@RequestMapping(value="view", method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<CommonBean> l=new ArrayList<CommonBean>();
		List<RegisterDTO> data = loginDAO.getData();
		for(RegisterDTO p:data) {
			CommonBean c=new CommonBean();
			c.setName(p.getName());
			c.setFname("Mr. "+p.getFname());
			c.setPhone(p.getPhone());
			c.setAdd(p.getAdd());
//			c.setGndr(p.getGndr().equalsIgnoreCase("m")? "Male" : (p.getGndr().equalsIgnoreCase("f")?"Female":"Other"));
			c.setGndr(p.getGndr());
			
//			c.setStName(stateInterface.getStateBeanNameByStName(p.getStCode()).getStName());
			l.add(c);
		}
		
		return new ModelAndView("view","v",l);
	}
}
