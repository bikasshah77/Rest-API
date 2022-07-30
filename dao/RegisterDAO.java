package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.RegisterDTO;
import com.interfce.LoginInterface;
import com.interfce.RegisterInterface;

@Repository
public class RegisterDAO {

	@Autowired
	RegisterInterface registerInterface;
	@Autowired
	LoginInterface loginInterface;

	public int insertRegister(RegisterDTO registerDTO) {
		RegisterDTO rdto = registerInterface.save(registerDTO);
		return rdto.getRid();
	}
	

	public List<RegisterDTO> getName() {
		List<RegisterDTO> name = (List<RegisterDTO>) loginInterface.findAll();
		return name;
	}
}
