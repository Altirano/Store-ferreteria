package com.BO.Store_ferreteria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.API.ClientesAPI;
import com.API.UsuariosAPI;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.DAO")
@EntityScan("com.Model")
@ComponentScan(basePackageClasses = UsuariosAPI.class)
@ComponentScan(basePackageClasses = ClientesAPI.class)
public class StoreFerreteriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreFerreteriaApplication.class, args);
	}

}
