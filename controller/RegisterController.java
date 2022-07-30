package com.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.RegisterBean;
import com.bean.StateBean;
import com.dao.RegisterDAO;
import com.dao.StateDAO;
import com.dto.RegisterDTO;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterBean registerBean;
//	@Autowired
//	UserValidation userValidation;
	@Autowired
	RegisterDTO registerDTO;
	@Autowired
	RegisterDAO registerDAO;
	@Autowired
	StateDAO stateDAO;

	//############### register display #################
	@RequestMapping(value="open", method=RequestMethod.GET)
	public ModelAndView openRegister() {
		
		//############### validation #################
//		userValidation.validate(registerBean, br);
//		if(br.hasErrors()) {
//			return new ModelAndView("register","reg",registerBean);
//		}else {
//			
//		}
		return new ModelAndView("register","reg",registerBean);
	}
	
	//############### login display #################
	@RequestMapping(value="regist", method=RequestMethod.POST)
	public String saveRegister(String mob,@ModelAttribute("reg") RegisterBean registerBean, ModelMap m) {
		BeanUtils.copyProperties(registerBean, registerDTO);
		
		if(registerDAO.insertRegister(registerDTO)>0){
			m.addAttribute("lgn", registerBean);
			return "login";
		}else {
			return "error";
		}
	}
	
	
	//############### state display #################
	@ModelAttribute("slist")
	public List<StateBean> getStateName() {
		List<StateBean> slist = stateDAO.getStateList();
		return slist;
	}
	
	
	@ModelAttribute("name")
	public List<RegisterDTO> getName() {
		List<RegisterDTO> name = registerDAO.getName();
		return name;
	}
	
}
