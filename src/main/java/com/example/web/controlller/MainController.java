package com.example.web.controlller;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.web.form.User;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/user")
public class MainController {

	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		List<String> listDepartment = Arrays.asList("Mechanical", "Electrical", "IT");
		model.addAttribute("listdepartment", listDepartment);
		return "register_form";
	}

	@GetMapping("/test")
	public String test() {
		System.out.println("done");
		return "register_form";

	}
}
