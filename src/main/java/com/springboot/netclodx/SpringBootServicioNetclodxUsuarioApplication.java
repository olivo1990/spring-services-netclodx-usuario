package com.springboot.netclodx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SpringBootServicioNetclodxUsuarioApplication implements CommandLineRunner{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootServicioNetclodxUsuarioApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) throws Exception {

		/*String passwordBcrypt = passwordEncoder.encode("pro_123");
		System.out.println(passwordBcrypt);*/
		
		
	}

}
