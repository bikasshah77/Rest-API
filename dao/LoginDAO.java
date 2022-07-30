package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.RegisterDTO;
import com.interfce.LoginInterface;
import com.interfce.RegisterInterface;

@Repository
public class LoginDAO {
	@Autowired
	LoginInterface loginInterface;
	@Autowired
	RegisterDTO registerDTO;
	@Autowired
	RegisterInterface registerInterface;
	
	public String loginDetail(RegisterDTO registerDTO) {
		try {
			RegisterDTO rname = loginInterface.getRegisterDTOByName(registerDTO.getName());
			return rname.getName();
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Invalid");
			return "error";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public List<RegisterDTO> getData() {
		return (List<RegisterDTO>) registerInterface.findAll();
	}
	

}
