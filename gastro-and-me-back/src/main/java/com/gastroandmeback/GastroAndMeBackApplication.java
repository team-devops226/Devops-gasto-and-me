package com.gastroandmeback;

import com.gastroandmeback.dto.RestaurantDTO;
import com.gastroandmeback.entities.RestaurantEntity;
import org.mapstruct.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GastroAndMeBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(GastroAndMeBackApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}
