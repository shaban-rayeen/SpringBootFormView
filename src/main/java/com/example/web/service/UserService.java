package com.example.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.web.form.User;
import com.example.web.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository UserRepository;

	public List<User> getAll() {
		return (List<User>) UserRepository.findAll();
	}
}
