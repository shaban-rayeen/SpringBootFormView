package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception{
       	String sql = "INSERT INTO users (name,email,address,phone,sex,department) VALUES(?,?,?)";
    int result = jdbcTemplate.update(sql, "aman","aman@gmail.com","noida","8507645259","male","it");
    
    if (result>0) {
    	System.out.println("A new row has been inserted");
    }
    }
}
 