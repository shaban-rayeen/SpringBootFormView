package com.example.web.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.web.form.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	List<User> findAll();
}