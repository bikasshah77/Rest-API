package com.interfce;

import org.springframework.data.repository.CrudRepository;

import com.dto.RegisterDTO;

public interface LoginInterface extends CrudRepository<RegisterDTO, String>{
	RegisterDTO getRegisterDTOByName(String name);
}
