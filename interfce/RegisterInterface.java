package com.interfce;

import org.springframework.data.repository.CrudRepository;

import com.dto.RegisterDTO;

public interface RegisterInterface extends CrudRepository<RegisterDTO, String>{

}
